package com.insightfullogic.java8.examples.chapter8.template_method.traditional;

@SuppressWarnings("javadoc")
public class CompanyLoanApplication extends LoanApplication {

  @Override
  protected void checkIdentity() {
    // does nothing
  }

  @Override
  protected void checkIncomeHistory() {
    // does nothing
  }

  @Override
  protected void checkCreditHistory() {
    // does nothing
  }

}
