package com.insightfullogic.java8.examples.chapter8.template_method.lambdas;

import com.insightfullogic.java8.examples.chapter8.template_method.ApplicationDenied;

// BEGIN Criteria
@SuppressWarnings("javadoc")
public interface Criteria {

  public void check() throws ApplicationDenied;

}
// END Criteria
