package com.huayu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;

/**
 * SpringBootServletInitializer:Servlet初始化器
 * 
 * @author dougang
 */
@SpringBootApplication // 启动SpringBoot
@EnableTransactionManagement // 启动事务管理器
@MapperScan("com.huayu.dao") // 声明mapper所在的包名
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}