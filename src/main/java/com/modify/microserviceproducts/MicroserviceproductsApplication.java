package com.modify.microserviceproducts;

import com.modify.microserviceproducts.dao.ProductDao;
import com.modify.microserviceproducts.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MicroserviceproductsApplication implements CommandLineRunner {

	@Autowired
	private ProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceproductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Insert static list of products
		productDao.saveAll(Arrays.asList(
				new Product(1, "Laptop", "High-performance laptop", "laptop.png", 1200.00),
				new Product(2, "Smartphone", "Latest smartphone", "smartphone.png", 800.00),
				new Product(3, "Tablet", "10-inch tablet", "tablet.png", 300.00)
		));
		System.out.println("Static product list inserted into database!");
	}
}
