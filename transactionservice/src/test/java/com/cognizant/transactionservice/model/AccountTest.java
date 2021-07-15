package com.cognizant.transactionservice.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.cognizant.transactionservice.models.Account;
import com.cognizant.transactionservice.models.Transaction;

class AccountTest {

	Transaction t = new Transaction();
	List<Transaction> list = new ArrayList<Transaction>();
	Account account = new Account();
	Account account1 = new Account(101834, "cust1234", 1000, "savings", "Ravi", list);

	@Test
	void setAccountIdTest() {
		account.setAccountId(101834);
		assertEquals(101834, account.getAccountId());
	}

	@Test
	void setCustomerIdTest() {
		account.setCustomerId("Cust101");
		assertEquals("Cust101", account.getCustomerId());
	}

	@Test
	void setCurrentBalanceTest() {
		account.setCurrentBalance(5000);
		assertEquals(5000, account.getCurrentBalance());
	}

	@Test
	void setAccountTypeTest() {
		account.setAccountType("Savings");
		assertEquals("Savings", account.getAccountType());
	}

	@Test
	void setOwnerNameTest() {
		account.setOwnerName("Nagarjun");
		assertEquals("Nagarjun", account.getOwnerName());
	}

	@Test
	void setTransactionsTest() {
		account.setTransactions(null);
		assertEquals(null, account.getTransactions());
	}

	@Test
	void getAccTest() {
		account.setAccountId(101923);
		assertTrue(account.getAccountId() == 101923);
	}

	@Test
	void getCustomerTest() {
		account.setCustomerId("cust1234");
		assertTrue(account.getCustomerId() == "cust1234");
	}

	@Test
	void getAcctypeTest() {
		account.setAccountType("Bisuness");
		assertTrue(account.getAccountType() == "Bisuness");
	}

	@Test
	void getTokenTest() {
		account.setCurrentBalance(1000);
		assertTrue(account.getCurrentBalance() == 1000);
	}

	@Test
	void getOwnerTest() {
		account.setOwnerName("Raj");
		assertTrue(account.getOwnerName() == "Raj");
	}
}
