package com.leetcode.algorithm.medium.intervallistintersections;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new Interval[] {
        new Interval(1, 2),
        new Interval(5,5),
        new Interval(8, 10),
        new Interval(15, 23),
        new Interval(24,24),
        new Interval(25, 25)
    }, solution.intervalIntersection(new Interval[] {
        new Interval(0, 2),
        new Interval(5, 10),
        new Interval(13, 23),
        new Interval(24, 25)
    }, new Interval[] {
        new Interval(1, 5),
        new Interval(8, 12),
        new Interval(15, 24),
        new Interval(25, 26)
    }));
  }
}
