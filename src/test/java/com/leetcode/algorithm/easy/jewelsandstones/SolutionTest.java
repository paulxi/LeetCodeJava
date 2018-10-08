package com.leetcode.algorithm.easy.jewelsandstones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.numJewelsInStones("z", "ZZ"));
  }
}
