/*
package com.example.demo;

import com.example.demo.rpc.Historydata;
import com.example.demo.rpc.historydataGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RpcClientTest {
    private static final Logger logger = Logger.getLogger(RpcClientTest.class.getName());

    public static void main(String[] args) {
        Channel channel = ManagedChannelBuilder.forAddress("localhost", 7080).usePlaintext().build();
        historydataGrpc.historydataBlockingStub blockingStub=historydataGrpc.newBlockingStub(channel);
        Historydata.snReq request = Historydata.snReq.newBuilder().setSn("9031").build();
        com.example.demo.rpc.Historydata.redisFindHistoryRes response = blockingStub.redisFindHistory(request);
        logger.info("Greeting: " + response);
    }
}
*/
