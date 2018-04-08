package com.impaq.pos.repository;

import com.impaq.pos.dto.Product;
import java.util.ArrayList;
import java.util.List;


public class ShopProductsRepositoryImpl implements ShopProductsRepository {

    private List<Product> productsList = new ArrayList<Product>();

    public ShopProductsRepositoryImpl() {
        productsList.add(new Product("111-111-111", "Mineral Water", "5.0$", 50));
        productsList.add(new Product("222-222-222", "Coca-Cola", "2.0$", 20));
        productsList.add(new Product("333-333-333", "Coffee", "3.0$", 15));
        productsList.add(new Product("444-444-444", "Beer", "2.0$", 25));
        productsList.add(new Product("555-555-555", "Orange juice", "4.0$", 0));
    }


    public void saveAll(List<Product> productList) {
        this.productsList = productList;
    }

    public List<Product> findAll() {
        return this.productsList;
    }

    public Product getProductByBarCode(String barCode) {
        for (Product product : productsList) {
            if (product.getBarCode().equals(barCode)) {
                if (product.getAmountOfProducts() > 0) {
                    return product;
                } else {
                    return null;
                }
            }

        }
        return null;
    }


    public void reduceTheNumberOfProducts(String barCode) {
        for (Product product : productsList) {
            if (product.getBarCode().equals(barCode)) {
                product.setAmountOfProducts(product.getAmountOfProducts() - 1);
            }
        }
    }


}
