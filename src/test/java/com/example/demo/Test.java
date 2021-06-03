package com.example.demo;


import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import io.etcd.jetcd.kv.GetResponse;
import io.etcd.jetcd.options.GetOption;

import java.util.concurrent.ExecutionException;
import static com.google.common.base.Charsets.UTF_8;
public class Test {
    public static void main(String[] args) throws Exception {
        Test t=new Test();
        t.TestEtcd();
    }

    public void TestEtcd() throws ExecutionException, InterruptedException {
        // create client
        Client client = Client.builder().endpoints("http://192.168.230.129:2379").build();
        KV kvClient = client.getKVClient();
//        ByteSequence key = ByteSequence.from("kde-iot-go-historydata.rpc/112442387719925840".getBytes());
//        GetResponse response = kvClient.get(key).get();
       // System.out.println(response);

        GetOption getOption = GetOption.newBuilder().withPrefix(ByteSequence.from("kde-iot-go-historydata.rpc",UTF_8)).build();
        try {
            GetResponse res = client.getKVClient().get(ByteSequence.from("kde-iot-go-historydata.rpc",UTF_8), getOption).get();
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
