package com.leetcode.algorithm.medium.minimumgeneticmutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        1,
        solution.minMutation("AACCGGTT", "AACCGGTA", new String[] {"AACCGGTA"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        2,
        solution.minMutation("AACCGGTT", "AAACGGTA", new String[] {"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(
        3,
        solution.minMutation("AAAAACCC", "AACCCCCC", new String[] {"AAAACCCC", "AAACCCCC", "AACCCCCC"}));
  }
}
