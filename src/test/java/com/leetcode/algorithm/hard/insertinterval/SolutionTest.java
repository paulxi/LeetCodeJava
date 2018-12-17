package com.leetcode.algorithm.hard.insertinterval;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(new Interval(1, 5), new Interval(6, 9)),
        solution.insert(Arrays.asList(
            new Interval(1, 3),
            new Interval(6, 9)
        ), new Interval(2, 5)));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(new Interval(1, 2), new Interval(3, 10), new Interval(12, 16)),
        solution.insert(Arrays.asList(
            new Interval(1, 2),
            new Interval(3, 5),
            new Interval(6, 7),
            new Interval(8, 10),
            new Interval(12, 16)
        ), new Interval(4, 8)));
  }
}
