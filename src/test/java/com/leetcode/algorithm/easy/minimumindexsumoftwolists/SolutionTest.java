package com.leetcode.algorithm.easy.minimumindexsumoftwolists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new String[] {"Shogun"}, solution.findRestaurant(new String[] {"Shogun", "Tapioca Express", "Burger King", "KFC"},
        new String[] {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new String[] {"Shogun"}, solution.findRestaurant(new String[] {"Shogun", "Tapioca Express", "Burger King", "KFC"},
        new String[] {"KFC", "Shogun", "Burger King"}));
  }
}
