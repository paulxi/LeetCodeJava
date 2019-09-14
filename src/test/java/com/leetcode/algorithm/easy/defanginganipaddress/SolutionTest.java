package com.leetcode.algorithm.easy.defanginganipaddress;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr("1.1.1.1"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr("255.100.50.0"));
  }
}
