package com.sacha.messaging;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("messages")
public class MessageController {
    private List<Transaction> transactions = new ArrayList<>(List.of(
            new Transaction("TXN001", TransactionStatus.CONFIRMED),
            new Transaction("TXN002", TransactionStatus.PENDING),
            new Transaction("TXN003", TransactionStatus.FAILED)
    ));

    @GetMapping
    public List<Transaction> getMessages(){
        return transactions;
    }
    @GetMapping("/{id}")
    public Transaction getMessageById(@PathVariable String id){
        for(Transaction t :transactions){
            if(id.equals(t.getId()))return t;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not found: " + id);
    }
}
