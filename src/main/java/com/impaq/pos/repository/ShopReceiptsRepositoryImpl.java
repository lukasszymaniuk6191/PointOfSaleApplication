package com.impaq.pos.repository;

import com.impaq.pos.dto.Receipt;

import java.util.ArrayList;
import java.util.List;


public class ShopReceiptsRepositoryImpl implements ShopReceiptsRepository {

    private List<Receipt> receiptList = new ArrayList<>();

    public void save(Receipt receipt) {
        receiptList.add(receipt);
    }

    public List<Receipt> findAll() {
        return receiptList;
    }

}
