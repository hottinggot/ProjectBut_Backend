package com.project.but;

import com.project.but.but.entity.Receipt;
import com.project.but.but.repository.ReceiptRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ButApplicationTests {

    @Autowired
    ReceiptRepository receiptRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void insertDummyData(){
        Receipt receipt = new Receipt();
        receipt.setTitle("첫 번째 영수증");
        receipt.setUserId(1);
        receipt.setCreateDate(new Date());

        receiptRepository.save(receipt);
    }

}
