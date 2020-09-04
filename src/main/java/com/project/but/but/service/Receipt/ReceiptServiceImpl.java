package com.project.but.but.service.Receipt;

import com.project.but.but.entity.Receipt;
import com.project.but.but.repository.ReceiptRepository;
import com.project.but.but.service.Receipt.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    ReceiptRepository receiptRepository;

    public List<Receipt> selectAll(){
        return (List<Receipt>) receiptRepository.findAll();
    }
}
