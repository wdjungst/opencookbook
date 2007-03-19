package org.ocobo.test;

public class InitializationTest extends AbstractTransactionalSpringContextTests {

  public void testApplicationContext() {
    assertNotNull("Application context must not be null.", getApplicationContext());
  }

}
