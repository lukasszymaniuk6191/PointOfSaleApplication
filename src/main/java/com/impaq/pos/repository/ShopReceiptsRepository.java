package com.impaq.pos.repository;

import com.impaq.pos.dto.Receipt;

import java.util.List;

public interface ShopReceiptsRepository {

    void save(Receipt receipt);

    List<Receipt> findAll();
}
