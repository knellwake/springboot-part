package com.wake;

import com.wake.listener.MyAppListener;
import com.wake.pojo.Dog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringbootFeatures01Application {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootFeatures01Application.class, args);

        SpringApplication springApplication = new SpringApplication(SpringbootFeatures01Application.class);
        ConfigurableApplicationContext applicationContext = springApplication.run(args);

        try {
            Dog bean = applicationContext.getBean(Dog.class);

            log.info("Dog,{}",bean);
        }catch (Exception e){
            log.info("NO!");
        }
    }
}
