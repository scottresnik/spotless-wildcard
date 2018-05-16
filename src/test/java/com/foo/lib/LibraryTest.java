/*
 *  Copyright (C) 2001-2018 Spotless Header. All rights reserved.
 */
package com.foo.lib;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LibraryTest
{

  @Test
  public void testSomeLibraryMethod()
  {
    Library classUnderTest = new Library();
    assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
  }
}
