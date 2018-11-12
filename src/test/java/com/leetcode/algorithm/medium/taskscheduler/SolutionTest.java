package com.leetcode.algorithm.medium.taskscheduler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    char[] tasks = {'A','A','A','B','B','B'};
    assertEquals(8, solution.leastInterval(tasks, 2));
  }
}
