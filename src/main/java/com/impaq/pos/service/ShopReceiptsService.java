package com.impaq.pos.service;

import com.impaq.pos.dto.Client;
import com.impaq.pos.dto.Receipt;

public interface ShopReceiptsService {

    Receipt generateReceipt(Client client);

    String printReceipt();
}
