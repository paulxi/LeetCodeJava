package com.leetcode.algorithm.hard.numberofatoms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("H2O", solution.countOfAtoms("H2O"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("H2MgO2", solution.countOfAtoms("Mg(OH)2"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("K4N2O14S4", solution.countOfAtoms("K4(ON(SO3)2)2"));
  }
}

