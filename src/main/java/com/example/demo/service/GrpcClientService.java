package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.rpc.Historydata;
import io.grpc.StatusRuntimeException;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GrpcClientService {

    @Autowired(required = false)
    @Setter
    private StubWrapper stubWrapper;

    public String sendMessage(final String name) {
        // 很有可能simpleStub对象为null
        if (null==stubWrapper) {
            return "invalid SimpleBlockingStub, please check etcd configuration";
        }

        try {

            final Historydata.redisFindHistoryRes res = stubWrapper.getSimpleBlockingStub().redisFindHistory(Historydata.snReq.newBuilder().setSn(name).build());
            if("".equals(res.toString())){
                return "no data";
            }
            log.info(res.toString());
            return res.toString();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

}
