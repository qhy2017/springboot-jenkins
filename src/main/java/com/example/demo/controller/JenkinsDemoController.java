package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemoController {

    @RequestMapping(value = "/getHelloWorld",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getHelloWorld()  {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("jsonObject","HelloWorld");
        System.out.println("输出日志------------------------------");
        return jsonObject;
    }
}
