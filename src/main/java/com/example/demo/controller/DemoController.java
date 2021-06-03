package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/logs/{type}/{info}")
    public String logs(@PathVariable("type") Integer type, @PathVariable("info") String info){

        switch (type){
            case 1:
                log.info("这是一个info级别的:{}",info);
                break;
            case 2:
                log.debug("这是一个debug级别的:{}",info);
                break;
            case 3:
                log.error("这是一个error级别的:{}",info);
                break;
            default:
                log.trace("这是一个trace级别的:{}",info);
        }
        return "success";
    }
}
