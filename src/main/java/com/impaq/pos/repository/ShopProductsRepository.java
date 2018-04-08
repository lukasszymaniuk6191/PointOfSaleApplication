package com.impaq.pos.repository;

import com.impaq.pos.dto.Product;

import java.util.List;

public interface ShopProductsRepository {

    Product getProductByBarCode(String barCode);

    void reduceTheNumberOfProducts(String barCode);

    void saveAll(List<Product> productList);

    List<Product> findAll();
}
