package com.leetcode.algorithm.hard.palindromepairs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1, 0),
        Arrays.asList(3, 2),
        Arrays.asList(0, 1),
        Arrays.asList(2, 4)
    );

    assertEquals(expected, solution.palindromePairs(new String[] {"abcd", "dcba", "lls", "s", "sssll"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 0), Arrays.asList(0, 1));

    assertEquals(expected, solution.palindromePairs(new String[] {"bat","tab","cat"}));
  }
}
