package com.willaular.shoppingweb.services;

import com.willaular.shoppingweb.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> all() {
        List<Product> products = new ArrayList();
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Blusa");
        product1.setColor("Amarillo");
        product1.setSize("S");
        product1.setPrice(32.5);
        products.add(product1);
        return products;
    }
}
