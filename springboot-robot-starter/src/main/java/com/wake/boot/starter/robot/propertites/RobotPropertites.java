package com.wake.boot.starter.robot.propertites;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "robot")
@Data
public class RobotPropertites {
    private String name;
    private Integer age;
    private String email;
}