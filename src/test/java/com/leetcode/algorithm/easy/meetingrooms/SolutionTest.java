package com.leetcode.algorithm.easy.meetingrooms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.canAttendMeetings(new Interval[] {
        new Interval(0, 30),
        new Interval(5, 10),
        new Interval(15, 20)
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.canAttendMeetings(new Interval[] {
        new Interval(7, 10),
        new Interval(2, 4)
    }));
  }
}
