package com.impaq.pos.service;

import com.impaq.pos.dto.Product;

public interface ShopProductsService {

    Product getProductFromStore(String barCode);

}
