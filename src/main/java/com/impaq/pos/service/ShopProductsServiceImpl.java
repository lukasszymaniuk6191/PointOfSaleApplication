package com.impaq.pos.service;

import com.impaq.pos.dto.Product;
import com.impaq.pos.repository.ShopProductsRepository;


public class ShopProductsServiceImpl implements ShopProductsService {

    private ShopProductsRepository shopRepository;

    public ShopProductsServiceImpl() {
    }

    public ShopProductsServiceImpl(ShopProductsRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public Product getProductFromStore(String barCode) {
        Product product = null;
        product = shopRepository.getProductByBarCode(barCode);

        if (product != null) {
            shopRepository.reduceTheNumberOfProducts(barCode);
        }
        return product;

    }


}
