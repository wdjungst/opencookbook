package org.ocobo.test;

public abstract class AbstractDependencyInjectionSpringContextTests
    extends
    org.springframework.test.AbstractDependencyInjectionSpringContextTests {

  @Override
  protected String[] getConfigLocations() {
    return new String[]{ "classpath*:applicationContext.xml" };
  }

}
