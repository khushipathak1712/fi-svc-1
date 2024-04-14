package com.yourcompany.financialinsights.service;

import com.yourcompany.financialinsights.model.Transaction;
import com.yourcompany.financialinsights.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Map<String, Double> getTotalSpendingPerCategory() {
        List<Transaction> transactions = transactionRepository.findAll();
        Map<String, Double> spendingPerCategory = new HashMap<>();
        for (Transaction transaction : transactions) {
            String category = transaction.getCategory();
            double amount = transaction.getAmount();
            spendingPerCategory.put(category, spendingPerCategory.getOrDefault(category, 0.0) + amount);
        }
        return spendingPerCategory;
    }
}