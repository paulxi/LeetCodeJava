package com.leetcode.algorithm.hard.nooverlappinginterval;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(new Interval(17, 25)),
        solution.findIntervals(Arrays.asList(
            new Interval(10, 15),
            new Interval(25, 35)
        ), new Interval(17, 27)));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(new Interval(17, 25), new Interval(35, 45), new Interval(65, 85), new Interval(95, 100)),
        solution.findIntervals(Arrays.asList(
            new Interval(10, 15),
            new Interval(25, 35),
            new Interval(45, 65),
            new Interval(85, 95)
        ), new Interval(17, 100)));
  }
}
