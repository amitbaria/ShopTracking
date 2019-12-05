package com.example.shop.Shop.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.shop.Shop.demo.repository.ShopRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {ShopRepository.class})
public class ShopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopDemoApplication.class, args);
	}

}
