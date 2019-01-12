package com.leetcode.algorithm.hard.robotroomcleaner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    MockRobot robot = new MockRobot(new int[][] {{1, 1, 1}, {0, 1, 0}, {1, 1, 1}}, 1, 1, 0);
    solution.cleanRoom(robot);
    assertArrayEquals(new boolean[][] {{true, true, true}, {false, true, false}, {true, true, true}},
        robot.getCleaned());
  }
}
