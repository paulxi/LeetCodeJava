package com.leetcode.algorithm.medium.accountsmerge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
        Arrays.asList("John", "johnnybravo@mail.com"),
        Arrays.asList("Mary", "mary@mail.com")
      ), solution.accountsMerge(Arrays.asList(
        Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
        Arrays.asList("John", "johnnybravo@mail.com"),
        Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
        Arrays.asList("Mary", "mary@mail.com")
    )));
  }
}
