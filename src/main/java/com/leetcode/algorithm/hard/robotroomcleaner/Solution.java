package com.leetcode.algorithm.hard.robotroomcleaner;

import com.leetcode.algorithm.common.Robot;

import java.util.HashSet;
import java.util.Set;

class Solution {
  private static final int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

  public void cleanRoom(Robot robot) {
    helper(robot, 0, 0, 0, new HashSet<String>());
  }

  private void helper(Robot robot, int row, int col, int direction, Set<String> visited) {
    visited.add(row + "," + col);
    robot.clean();

    for (int i = 0; i < 4; i++) {
      int curDirection = (i + direction) % 4;
      int nx = row + directions[curDirection][0];
      int ny = col + directions[curDirection][1];

      if (!visited.contains(nx + "," + ny) && robot.move()) {
        helper(robot, nx, ny, curDirection, visited);
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
      }
      robot.turnRight();
    }
  }
}
