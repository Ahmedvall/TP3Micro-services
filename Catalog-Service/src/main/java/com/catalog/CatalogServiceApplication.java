package com.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.catalog.entities.Category;
import com.catalog.entities.Product;
import com.catalog.repository.CategoryRepo;
import com.catalog.repository.ProductRepo;

@SpringBootApplication
@EnableEurekaClient
public class CatalogServiceApplication implements CommandLineRunner {
	
	@Autowired
	ProductRepo productRepo;
	@Autowired
	CategoryRepo categoryRepo;

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category c1 = new Category("Computers");
		Category c2 = new Category("Printers");
		c1 = categoryRepo.save(c1);
		c2= categoryRepo.save(c2);
		
		Product p1 = new Product("HP 5433", 65444, c1);
		productRepo.save(p1);
		Product p2 = new Product("MacBook 123", 111000, c1);
		productRepo.save(p2);
		Product p3 = new Product("Del", 5550, c1);
		productRepo.save(p3);
		
		Product p11 = new Product("P1", 1234, c2);
		productRepo.save(p11);
		Product p12 = new Product("P2", 6778, c2);
		productRepo.save(p12);
		
	}

}
