package com.leetcode.algorithm.hard.employeefreetime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<Interval> expected = Arrays.asList(new Interval(3, 4));

    assertEquals(expected, solution.employeeFreeTime(Arrays.asList(
        Arrays.asList(new Interval(1, 2), new Interval(5, 6)),
        Arrays.asList(new Interval(1, 3)),
        Arrays.asList(new Interval(4, 10))
    )));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<Interval> expected = Arrays.asList(new Interval(5, 6), new Interval(7, 9));

    assertEquals(expected, solution.employeeFreeTime(Arrays.asList(
        Arrays.asList(new Interval(1, 3), new Interval(6, 7)),
        Arrays.asList(new Interval(2, 4)),
        Arrays.asList(new Interval(2, 5), new Interval(9, 12))
    )));
  }
}
