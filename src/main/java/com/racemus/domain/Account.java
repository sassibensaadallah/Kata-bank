package com.racemus.domain;

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
		//Not implemented yet
	}
	
	public void deposit(float amount) {
		//Not implemented yet
	}
	
	public void history() {
		//Not implemented yet
	}	
}
