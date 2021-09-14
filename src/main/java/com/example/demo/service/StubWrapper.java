package com.example.demo.service;

import com.example.demo.rpc.historydataGrpc;
import com.example.demo.rpc.transform.transformerGrpc;
import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import io.etcd.jetcd.kv.GetResponse;
import io.etcd.jetcd.options.GetOption;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import static com.google.common.base.Charsets.UTF_8;
@Component("stubWrapper")
@Data
@Slf4j
@ConfigurationProperties(prefix = "grpc")
public class StubWrapper {

    /**
     * 这是etcd中的一个key，该key对应的值是grpc服务端的地址信息
     */
    private static final String GRPC_SERVER_INFO_KEY = "kde-iot-go-historydata.rpc";
    private static final String GRPC_SERVER_SHORTURL_KEY = "transform.rpc";

    /**
     * 配置文件中写好的etcd地址
     */
    private String etcdendpoints;



    private historydataGrpc.historydataBlockingStub simpleBlockingStub;

    private transformerGrpc.transformerBlockingStub transformerBlockingStub;

    /**
     * 从etcd查询gRPC服务端的地址 取前缀
     * @return
     */
    public String[] getGrpcServerInfo() {
        // 创建client类
        //KV kvClient = Client.builder().endpoints(etcdendpoints.split(",")).build().getKVClient();
        KV kvClient = Client.builder().endpoints(etcdendpoints).build().getKVClient();

        GetResponse response = null;

        // 去etcd查询/grpc/local-server这个key的值
        try {
            GetOption getOption = GetOption.newBuilder().withPrefix(ByteSequence.from(GRPC_SERVER_INFO_KEY,UTF_8)).build();
            response = kvClient.get(ByteSequence.from(GRPC_SERVER_INFO_KEY, UTF_8),getOption).get();
        } catch (Exception exception) {
            log.error("get grpc key from etcd error", exception);
        }

        if (null==response || response.getKvs().isEmpty()) {
            log.error("empty value of key [{}]", GRPC_SERVER_INFO_KEY);
            return null;
        }

        // 从response中取得值
        String rawAddrInfo = response.getKvs().get(0).getValue().toString(UTF_8);

        // rawAddrInfo是“192.169.0.1:8080”这样的字符串，即一个IP和一个端口，用":"分割，
        // 这里用":"分割成数组返回
        return null==rawAddrInfo ? null : rawAddrInfo.split(":");
    }

    public String[] getTransformGrpcServerInfo() {
        // 创建client类
        //KV kvClient = Client.builder().endpoints(etcdendpoints.split(",")).build().getKVClient();
        KV kvClient = Client.builder().endpoints(etcdendpoints).build().getKVClient();

        GetResponse response = null;

        // 去etcd查询/grpc/local-server这个key的值
        try {
            GetOption getOption = GetOption.newBuilder().withPrefix(ByteSequence.from(GRPC_SERVER_SHORTURL_KEY,UTF_8)).build();
            response = kvClient.get(ByteSequence.from(GRPC_SERVER_SHORTURL_KEY, UTF_8),getOption).get();
        } catch (Exception exception) {
            log.error("get grpc key from etcd error", exception);
        }

        if (null==response || response.getKvs().isEmpty()) {
            log.error("empty value of key [{}]", GRPC_SERVER_SHORTURL_KEY);
            return null;
        }

        // 从response中取得值
        String rawAddrInfo = response.getKvs().get(0).getValue().toString(UTF_8);

        // rawAddrInfo是“192.169.0.1:8080”这样的字符串，即一个IP和一个端口，用":"分割，
        // 这里用":"分割成数组返回
        return null==rawAddrInfo ? null : rawAddrInfo.split(":");
    }

    /**
     * 每次注册bean都会执行的方法，
     * 该方法从etcd取得gRPC服务端地址，
     * 用于实例化成员变量SimpleBlockingStub
     */
    @PostConstruct
    public void simpleBlockingStub() {
        // 从etcd获取地址信息
        String[] array = getGrpcServerInfo();

        log.info("create stub bean, array info from etcd {}", Arrays.toString(array));

        // 数组的第一个元素是gRPC服务端的IP地址，第二个元素是端口
        if (null==array || array.length<2) {
            log.error("can not get valid grpc address from etcd");
            return;
        }

        // 数组的第一个元素是gRPC服务端的IP地址
        String addr = array[0];
        // 数组的第二个元素是端口
        int port = Integer.parseInt(array[1]);

        // 根据刚才获取的gRPC服务端的地址和端口，创建channel
        Channel channel = ManagedChannelBuilder
                .forAddress(addr, port)
                .usePlaintext()
                .build();

        // 根据channel创建stub
        simpleBlockingStub = historydataGrpc.newBlockingStub(channel);
    }

    @PostConstruct
    public void transformerBlockingStub() {
        // 从etcd获取地址信息
        String[] array = getTransformGrpcServerInfo();

        log.info("create stub bean, array info from etcd {}", Arrays.toString(array));

        // 数组的第一个元素是gRPC服务端的IP地址，第二个元素是端口
        if (null==array || array.length<2) {
            log.error("can not get valid grpc address from etcd");
            return;
        }

        // 数组的第一个元素是gRPC服务端的IP地址
        String addr = array[0];
        // 数组的第二个元素是端口
        int port = Integer.parseInt(array[1]);

        // 根据刚才获取的gRPC服务端的地址和端口，创建channel
        Channel channel = ManagedChannelBuilder
                .forAddress(addr, port)
                .usePlaintext()
                .build();

        // 根据channel创建stub
        transformerBlockingStub = transformerGrpc.newBlockingStub(channel);
    }

}
