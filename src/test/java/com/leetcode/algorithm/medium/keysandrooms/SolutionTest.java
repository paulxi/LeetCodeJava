package com.leetcode.algorithm.medium.keysandrooms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.canVisitAllRooms(Arrays.asList(
        Arrays.asList(1),
        Arrays.asList(2),
        Arrays.asList(3),
        Arrays.asList()
    )));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.canVisitAllRooms(Arrays.asList(
        Arrays.asList(1, 3),
        Arrays.asList(3, 0, 1),
        Arrays.asList(2),
        Arrays.asList(0)
    )));
  }
}
