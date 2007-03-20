package org.ocobo.test;

public abstract class AbstractTransactionalSpringContextTests
    extends
    org.springframework.test.AbstractTransactionalSpringContextTests {

  @Override
  protected String[] getConfigLocations() {
    return new String[]{ "classpath*:applicationContext.xml" };
  }

}
