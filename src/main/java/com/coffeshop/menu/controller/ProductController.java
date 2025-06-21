package com.coffeshop.menu.controller;

import com.coffeshop.menu.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private List<Product> productList = List.of(
            new Product(1, "Espresso", 2.50),
            new Product(2, "Latte", 3.50),
            new Product(3, "Croissant", 2.00),
            new Product(4, "Chocolate Muffin", 2.25),
            new Product(5, "Americano", 2.75)
    );

    @RequestMapping("/") // This maps to the URL http://localhost:8080/products/
    @ResponseBody
    public String home(){
        return "Welcome to the Coffee Shop";
    }

    @RequestMapping("/list") //http://localhost:8080/products/list
    @ResponseBody
    public String listProducts(){
        String productDisplay = "<strong>Product List: </strong> <hr>";
        for(Product p: productList){
            productDisplay += "Product: " + p.getId() + " - " + p.getName() + " - $" + p.getPrice() + "<br>";
        }
        return productDisplay;
    }
}
