package com.wake.boot.starter.robot.annotation;

import com.wake.boot.starter.robot.RobotAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({RobotAutoConfiguration.class})
public @interface EnableRobot {
}
