package com.racemus.domain;

import java.time.LocalDateTime;

public class Operation {
	private LocalDateTime date;
	private OperationType operationType;
	private float amount;
	private float balance;
	
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public OperationType getOperationType() {
		return operationType;
	}
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Operation [date=" + date + ", operationType=" + operationType + ", amount=" + amount + ", balance="
				+ balance + "]";
	}
}
