package com.project.but.but.controller;

import com.project.but.but.entity.Receipt;
import com.project.but.but.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @GetMapping(value = "/")
    public List<Receipt> selectAll(){
        List<Receipt> receiptList = receiptService.selectAll();
        return receiptList;
    }

}
