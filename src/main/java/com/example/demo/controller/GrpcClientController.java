package com.example.demo.controller;

import com.example.demo.rpc.Historydata;
import com.example.demo.service.GrpcClientService;
import com.example.demo.service.TransformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @Autowired
    private TransformService transformService;


    @RequestMapping("/realData/{name}")
    public String printMessage(@PathVariable(value = "name") String name) {
        return grpcClientService.sendMessage(name);
    }

    /**
     * url转成短字符并返回
     * @param name url
     * @return 短字符
     */
    @RequestMapping("/shorturl/{name}")
    public String shorturl(@PathVariable(value = "name") String name) {
        return transformService.shorten(name);
    }

    /**
     * 短字符转成url并返回
     * @param name 短字符
     * @return url
     */
    @RequestMapping("/expand/{name}")
    public String expand(@PathVariable(value = "name") String name) {
        return transformService.expand(name);
    }

}
