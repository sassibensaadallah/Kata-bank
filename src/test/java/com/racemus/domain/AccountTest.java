package com.racemus.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountTest {
	Account account;
	@BeforeEach
	public void init() {
		account=new Account();
		account.setBalance(1000);
	}
	
	@DisplayName("test Deposit")
	@Test
	public void testDeposit(){
		account.deposit(400);
		assertEquals(account.getBalance(), 1400);
	}
	
	@DisplayName("test withdrawal ")
	@Test
	public void testWithdrawal(){
		account.withdrawal(200);
		assertEquals(account.getBalance(), 800);
	}
	
	@DisplayName("test history")
	@Test
	public void testHistory() {
		account.withdrawal(100);
		account.withdrawal(150);
		account.deposit(200);
		account.deposit(500);
		account.history();
		assertEquals(account.getBalance(), 1450);
		assertEquals(account.getOperations().size(), 4);
	}
	
}
