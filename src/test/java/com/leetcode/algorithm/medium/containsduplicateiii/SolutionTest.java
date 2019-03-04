package com.leetcode.algorithm.medium.containsduplicateiii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true,
        solution.containsNearbyAlmostDuplicate(new int[] {1,2,3,1}, 3, 0));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true,
        solution.containsNearbyAlmostDuplicate(new int[] {1,0,1,1}, 1, 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false,
        solution.containsNearbyAlmostDuplicate(new int[] {1,5,9,1,5,9}, 2, 3));
  }
}
