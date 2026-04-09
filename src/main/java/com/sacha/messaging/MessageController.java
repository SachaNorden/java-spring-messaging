package com.sacha.messaging;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("messages")
public class MessageController {


    @GetMapping
    public List<Transaction> getMessages(){
        return List.of(
                new Transaction("TXN001", TransactionStatus.CONFIRMED),
                new Transaction("TXN002", TransactionStatus.PENDING),
                new Transaction("TXN003", TransactionStatus.FAILED)
        );
    }
}
