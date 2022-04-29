package com.codingdojo.javaspring.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.codingdojo.javaspring.savetravels.models.Expense;
import com.codingdojo.javaspring.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    public Expense createExpense(Expense b) {
        return expenseRepository.save(b);
    }
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    public Expense updateExpense(Expense b) {
    	return expenseRepository.save(b);
    }
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}
