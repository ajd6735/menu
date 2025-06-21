package com.coffeshop.menu;

import com.coffeshop.menu.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.coffeshop.menu.controller.ProductController;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);
		Product espresso = new Product(1, "Espresso", 2.99 );
		Product croissant = new Product(2, "Croissant", 3.49 );


	}

}
