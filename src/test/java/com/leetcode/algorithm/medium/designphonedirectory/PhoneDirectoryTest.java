package com.leetcode.algorithm.medium.designphonedirectory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneDirectoryTest {
  @Test
  public void testCase1() {
    PhoneDirectory directory = new PhoneDirectory(3);
    assertEquals(0, directory.get());
    assertEquals(1, directory.get());
    assertEquals(true, directory.check(2));
    assertEquals(2, directory.get());
    assertEquals(false, directory.check(2));
    directory.release(2);
    assertEquals(true, directory.check(2));
  }
}
