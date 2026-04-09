package com.sacha.messaging;

public class Transaction {
    private String id;
    private TransactionStatus statut;

    public Transaction(String id, TransactionStatus statut) {
        this.id = id;
        this.statut = statut;
    }

    public String getId() {
        return id;
    }

    public TransactionStatus getStatut() {
        return statut;
    }

}
