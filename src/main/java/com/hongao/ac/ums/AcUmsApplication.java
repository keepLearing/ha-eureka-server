package com.hongao.ac.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户模块
 * @author iTeller_zc
 *
 */
@SpringBootApplication
public class AcUmsApplication {

	public static void main(String[] args) {
		System.out.println("ums service is starting...");
		SpringApplication.run(AcUmsApplication.class, args);
		System.out.println("ums service has started...");
	}
}
