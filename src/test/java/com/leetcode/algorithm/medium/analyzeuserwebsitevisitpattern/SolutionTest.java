package com.leetcode.algorithm.medium.analyzeuserwebsitevisitpattern;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList("home", "about", "career"),
        solution.mostVisitedPattern(
            new String[] {
              "joe", "joe", "joe", "james", "james", "james", "james", "mary", "mary", "mary"
            },
            new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            new String[] {
              "home", "about", "career", "home", "cart", "maps", "home", "home", "about", "career"
            }));
  }
}
