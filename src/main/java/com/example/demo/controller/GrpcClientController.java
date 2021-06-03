package com.example.demo.controller;

import com.example.demo.rpc.Historydata;
import com.example.demo.service.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;


    @RequestMapping("/realData/{name}")
    public String printMessage(@PathVariable(value = "name") String name) {
        return grpcClientService.sendMessage(name);
    }

}
