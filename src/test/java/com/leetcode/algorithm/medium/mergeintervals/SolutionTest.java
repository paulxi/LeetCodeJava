package com.leetcode.algorithm.medium.mergeintervals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<Interval> expected = Arrays.asList(new Interval(1, 6),
        new Interval(8, 10),
        new Interval(15, 18));

    assertEquals(expected, solution.merge(Arrays.asList(new Interval(1, 3),
        new Interval(2, 6),
        new Interval(8, 10),
        new Interval(15, 18))));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<Interval> expected = Arrays.asList(new Interval(1, 5));

    assertEquals(expected, solution.merge(Arrays.asList(new Interval(1, 4),
        new Interval(4, 5))));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    List<Interval> expected = Arrays.asList(new Interval(1, 4));

    assertEquals(expected, solution.merge(Arrays.asList(new Interval(1, 4),
        new Interval(2, 3))));
  }
}
