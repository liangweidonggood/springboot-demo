package com.example.demo.service;


import com.example.demo.rpc.Historydata;
import com.example.demo.rpc.transform.Transform;
import io.grpc.StatusRuntimeException;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TransformService {

    @Autowired(required = false)
    @Setter
    private StubWrapper stubWrapper;

    public String shorten(final String name) {
        // 很有可能simpleStub对象为null
        if (null==stubWrapper) {
            return "invalid SimpleBlockingStub, please check etcd configuration";
        }

        try {

            Transform.shortenResp resp = stubWrapper.getTransformerBlockingStub().shorten(Transform.shortenReq.newBuilder().setUrl(name).build());
            if("".equals(resp.toString())){
                return "no data";
            }
            log.info(resp.toString());
            return resp.toString();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String expand(final String name) {
        // 很有可能simpleStub对象为null
        if (null==stubWrapper) {
            return "invalid SimpleBlockingStub, please check etcd configuration";
        }

        try {

            Transform.expandResp resp = stubWrapper.getTransformerBlockingStub().expand(Transform.expandReq.newBuilder().setShorten(name).build());
            if("".equals(resp.toString())){
                return "no data";
            }
            log.info(resp.toString());
            return resp.toString();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
}
