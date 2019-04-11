package com.leetcode.algorithm.medium.uniquewordabbreviation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidWordAbbrTest {
  @Test
  public void testCase1() {
    ValidWordAbbr abbr = new ValidWordAbbr(new String[] {"deer", "door", "cake", "card"});
    assertEquals(false, abbr.isUnique("dear"));
    assertEquals(true, abbr.isUnique("cart"));
    assertEquals(false, abbr.isUnique("cane"));
    assertEquals(true, abbr.isUnique("make"));
  }
}
