package com.sacha.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {
    private String id;
    @JsonProperty("status")
    private TransactionStatus status;

    public Transaction(String id, TransactionStatus status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public TransactionStatus getStatus() {
        return status;
    }

}
