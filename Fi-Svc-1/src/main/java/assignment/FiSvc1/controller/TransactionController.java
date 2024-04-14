package com.yourcompany.financialinsights.controller;

import com.yourcompany.financialinsights.model.Transaction;
import com.yourcompany.financialinsights.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public void addTransaction(@RequestBody Transaction transaction) {
        transactionService.save(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/insights")
    public Map<String, Double> getSpendingInsights() {
        return transactionService.getTotalSpendingPerCategory();
    }
}