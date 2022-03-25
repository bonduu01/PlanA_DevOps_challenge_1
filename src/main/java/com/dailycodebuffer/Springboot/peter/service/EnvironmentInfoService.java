package com.dailycodebuffer.Springboot.peter.service;

import com.dailycodebuffer.Springboot.peter.entity.EnvironmentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;
import java.time.Instant;

@Service
public class EnvironmentInfoService {
   // @Autowired
  //  EnvironmentInfo environmentInfo;

    HttpServletRequest httpServletRequest;

    public EnvironmentInfo getEnvInfo() throws UnknownHostException {

        EnvironmentInfo  environmentInfo = EnvironmentInfo.builder().timestamp(Instant.now())
        .hostname(java.net.InetAddress.getLocalHost().getHostName())
        .engine(System.getProperty("java.version")).build();
       // .visitorIp(httpServletRequest.getRemoteAddr())

        return  environmentInfo;
    }
}
