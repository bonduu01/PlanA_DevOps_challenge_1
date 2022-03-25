package com.dailycodebuffer.Springboot.peter.controller;

import com.dailycodebuffer.Springboot.peter.entity.EnvironmentInfo;
import com.dailycodebuffer.Springboot.peter.service.EnvironmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
public class EnvironmentInfoController {

    @Autowired
    EnvironmentInfoService environmentInfoService;

    @GetMapping("/")
    public EnvironmentInfo getEnvironmentInfo() throws UnknownHostException {

        return environmentInfoService.getEnvInfo();
    }
}
