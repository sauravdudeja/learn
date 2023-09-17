package com.cloud.learn;

import com.cloud.learn.service.IDGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication {


    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);

    }

}
