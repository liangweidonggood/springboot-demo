/*
package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.coreos.jetcd.Client;
import com.coreos.jetcd.KV;
import com.coreos.jetcd.data.ByteSequence;
import com.coreos.jetcd.kv.GetResponse;
import com.coreos.jetcd.kv.PutResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;

@Slf4j
public class Test2 {
    public static void main(String[] args) {
        Client client = Client.builder().endpoints(
                "http://192.168.230.129:2379"
        ).build();
        KV kvClient = client.getKVClient();
        try {
            ByteSequence bsKey = ByteSequence.fromString("kde-iot-go-historydata.rpc/112442387719925840");
            GetResponse getResponse = kvClient.get(bsKey).get();
            //System.out.println(getResponse);
            log.warn("response = {}", JSON.toJSONString(getResponse));
            //ByteSequence byteSequenceKey = getResponse.getKvs().get(0).getKey();
           // ByteSequence byteSequenceValue = getResponse.getKvs().get(0).getValue();

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
*/
