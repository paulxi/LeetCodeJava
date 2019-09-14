package com.leetcode.algorithm.easy.comparestringsbyfrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1},
        solution.numSmallerByFrequency(new String[] {"cbd"}, new String[] {"zaaaz"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1, 2},
        solution.numSmallerByFrequency(
            new String[] {"bbb", "cc"}, new String[] {"a", "aa", "aaa", "aaaa"}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1},
        solution.numSmallerByFrequency2(new String[] {"cbd"}, new String[] {"zaaaz"}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1, 2},
        solution.numSmallerByFrequency2(
            new String[] {"bbb", "cc"}, new String[] {"a", "aa", "aaa", "aaaa"}));
  }
}
