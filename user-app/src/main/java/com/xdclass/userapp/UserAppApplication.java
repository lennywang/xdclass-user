package com.xdclass.userapp;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDubboConfig
@DubboComponentScan("com.xdclass.userapp.service.dubbo")
@MapperScan("com.xdclass.userapp.mapper")
@SpringBootApplication
public class UserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}

}
