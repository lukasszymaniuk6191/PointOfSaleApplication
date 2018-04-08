package com.impaq.pos.dto;

import java.util.ArrayList;
import java.util.List;

public class Client {


    List<Product> productList = new ArrayList<>();


    public void addProduct(Product newProduct) {
        Product product = this.theSameProductAlreadyBought(newProduct);
        if (product == null) {
            Product prod = new Product(newProduct.getBarCode(), newProduct.getName(), newProduct.getPrice(), 1);
            productList.add(prod);
        } else {
            product.incrementAmountOfProducts();
        }


    }

    public Product theSameProductAlreadyBought(Product newProduct) {
        for (Product product : productList) {
            if (product.getBarCode().equals(newProduct.getBarCode())) {
                return product;
            }

        }

        return null;

    }


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
