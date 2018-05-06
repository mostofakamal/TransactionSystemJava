package com.cefalo.school;


import java.util.UUID;
import org.apache.commons.lang.NotImplementedException;


public class TransactionManager {

  //TODO:  Maintain a List of Transactions (Deposit/Withdraw/ Transfer )
  //TODO:  Add a Method for Adding Transaction
  //TODO: Add a method for Checking if there is any Pending Transtion
  public boolean hasPendingTransactions() {
    throw new NotImplementedException();
  }

  public void processPendingTransactions() {
    // The logic for processing pending transaction goes here
    // It should track which are already processed and which are pending transactions
    throw new NotImplementedException();
  }

  public void rollbackTransaction(UUID transactionId) {
    // The logic for rolling back a transaction with Id
    throw new NotImplementedException();
  }
}
