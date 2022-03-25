package com.dailycodebuffer.Springboot.peter.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class EnvironmentInfo {

    private Instant timestamp;
    private String hostname;
    private String engine;
    private String visitorIp;
}
