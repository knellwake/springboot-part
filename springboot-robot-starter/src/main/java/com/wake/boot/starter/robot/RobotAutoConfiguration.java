package com.wake.boot.starter.robot;

import com.wake.boot.starter.robot.controller.RobotController;
import com.wake.boot.starter.robot.propertites.RobotPropertites;
import com.wake.boot.starter.robot.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RobotController.class, RobotService.class, RobotPropertites.class})
public class RobotAutoConfiguration {

}