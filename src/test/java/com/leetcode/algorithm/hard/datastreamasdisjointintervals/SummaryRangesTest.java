package com.leetcode.algorithm.hard.datastreamasdisjointintervals;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummaryRangesTest {
  @Test
  public void testCase1() {
    SummaryRanges ranges = new SummaryRanges();
    ranges.addNum(1);
    assertEquals(Arrays.asList(new Interval(1, 1)), ranges.getIntervals());
    ranges.addNum(3);
    assertEquals(Arrays.asList(new Interval(1, 1),
        new Interval(3, 3)), ranges.getIntervals());
    ranges.addNum(7);
    assertEquals(Arrays.asList(new Interval(1, 1),
        new Interval(3, 3),
        new Interval(7, 7)), ranges.getIntervals());
    ranges.addNum(2);
    assertEquals(Arrays.asList(new Interval(1, 3),
        new Interval(7, 7)), ranges.getIntervals());
    ranges.addNum(6);
    assertEquals(Arrays.asList(new Interval(1, 3),
        new Interval(6, 7)), ranges.getIntervals());
  }
}
