package com.racemus.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
	private float balance;
	List<Operation> operations= new ArrayList<Operation>();
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public List<Operation> getOperations() {
		return operations;
	}
	
	public void withdrawal(float amount){
		if(balance>=amount) {
			balance-=amount;
			Operation operation= new Operation();
			operation.setAmount(amount);
			operation.setBalance(balance);
			operation.setDate(LocalDateTime.now());
			operation.setOperationType(OperationType.Withdrawal);
			operations.add(operation);
		} else  {
			System.out.println("insufficient balance");
		}
	}
	public void deposit(float amount) {
		balance+=amount;
		Operation operation= new Operation();
		operation.setAmount(amount);
		operation.setBalance(balance);
		operation.setDate(LocalDateTime.now());
		operation.setOperationType(OperationType.Deposit);
		operations.add(operation);
	}
	
	public void history() {
		this.operations.stream().forEach(System.out::println);
		}
}
