package com.cefalo.school;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TransactionTests {

  private TransactionManager transactionManager = new TransactionManager();

  @Test
  public void depositAccountCheckBalanceAndThenWithdraw_AllTransactionsSuccessful() {
      //TODO:
  }

  @Test
  public void test_WithDrawRequestForAmountGreaterThanAvailableBalance_TransactionExecutedWhenBalanceConstrainMet() {
    //TODO:
  }

  @Test
  public void testTransferRequestForAmountGreaterThanAvailableBalanceTransactionExecutedWhenBalanceConstrainMet() {
    //TODO:
  }

  @Test
  public void test_Transfer_ThenRollback_AccountStatusRegainedItsInitialState() {
   //TODO:
  }
}
