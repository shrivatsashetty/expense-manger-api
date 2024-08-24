package com.example.transactions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions") // http://localhost:8080/transactions
public class TransactionController {

    private List<Transaction> transactions = new ArrayList<>();

    // GET All Transactions
    @GetMapping // http://localhost:8080/transactions
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /* GET transaction by Id */
    @GetMapping("/{id}") // http://localhost:8080/transactions/1
    public Transaction getTransactionById(@PathVariable Integer transactionId) {
        return transactions.stream().filter( p -> p.getTransactionId().equals(transactionId) ).findFirst().orElse(null);
    }

    // POST new transaction
    @PostMapping("/add") // http://localhost:8080/transactions/add
    public String addTransaction(@RequestBody Transaction transaction) {
        this.transactions.add(transaction);
        return "Transaction added Sucessfully !!!";
    }
    // POST new transaction
    @PostMapping("/addmany") // http://localhost:8080/transactions/add
    public String addTransactions(@RequestBody List<Transaction> transactions) {
        this.transactions.addAll(transactions);
        return "Multiple Transactions Inserted Sucessfully !!!";
    }

    /* a DELETE mapping must always have void return type, i.e it just deletes and returns nothing */
    @DeleteMapping("/clearall") // http://localhost:8080/transactions/clearall
    public void clearAllTransactions() {
        this.transactions.clear();
    }

}
