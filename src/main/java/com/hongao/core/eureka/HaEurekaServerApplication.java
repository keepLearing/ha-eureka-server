package com.hongao.core.eureka;

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
		System.out.println("ha eureka server is starting...");
		SpringApplication.run(HaEurekaServerApplication.class, args);
		System.out.println("ha eureka server has started...");
	}
}
