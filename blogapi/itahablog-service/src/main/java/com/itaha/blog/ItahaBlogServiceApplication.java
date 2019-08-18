package com.itaha.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itaha.blog.mapper")
public class ItahaBlogServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ItahaBlogServiceApplication.class, args);
	}
}
