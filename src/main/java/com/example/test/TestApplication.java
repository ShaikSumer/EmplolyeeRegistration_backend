package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages= {"com.example.test"})
@EntityScan(basePackages = { "com.example.test" })
public class TestApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(TestApplication.class, args);
		
		
	}

	 @Bean
	 WebMvcConfigurer corsConfigurer() {
	 return new WebMvcConfigurer() {
	 @Override
	 public void addCorsMappings(CorsRegistry registry) {
	 registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT","PATCH","OPTION")
	 .allowedHeaders("authorization", "content-type", "x-auth-token");
	 }
	 };
	 }
}
