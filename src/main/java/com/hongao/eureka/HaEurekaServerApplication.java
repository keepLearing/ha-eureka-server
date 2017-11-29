package com.hongao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册模块
 * @author iTeller_zc
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class HaEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("Ha-Eureka-Server is starting...");
		SpringApplication.run(HaEurekaServerApplication.class, args);
		System.out.println("Ha-Eureka-Server has started...");
	}
}
