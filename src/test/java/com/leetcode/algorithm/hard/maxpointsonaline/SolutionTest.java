package com.leetcode.algorithm.hard.maxpointsonaline;

import com.leetcode.algorithm.common.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(3, solution.maxPoints(new Point[] {
        new Point(1, 1),
        new Point(2, 2),
        new Point(3, 3)
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(4, solution.maxPoints(new Point[] {
        new Point(1, 1),
        new Point(3, 2),
        new Point(5, 3),
        new Point(4, 1),
        new Point(2, 3),
        new Point(1, 4)
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals(6, solution.maxPoints(new Point[] {
        new Point(84, 250),
        new Point(0, 0),
        new Point(1, 0),
        new Point(0, -70),
        new Point(0, -70),
        new Point(1, -1),
        new Point(21, 10),
        new Point(42, 90),
        new Point(-42, -230)
    }));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();

    assertEquals(3, solution.maxPoints(new Point[] {
        new Point(2, 3),
        new Point(3, 3),
        new Point(-5, 3)
    }));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();

    assertEquals(2, solution.maxPoints(new Point[] {
        new Point(0, 0),
        new Point(94911151, 94911150),
        new Point(94911152, 94911151)
    }));
  }
}
