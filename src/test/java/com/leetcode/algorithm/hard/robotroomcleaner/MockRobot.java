package com.leetcode.algorithm.hard.robotroomcleaner;

import com.leetcode.algorithm.common.Robot;

public class MockRobot implements Robot {
  final static int[][] dirs = new int[][] {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

  int[][] room;
  int posX;
  int poxY;
  boolean[][] cleaned;
  int dir;

  public MockRobot(int[][] room, int posX, int posY, int dir) {
    this.room = room;
    this.posX = posX;
    this.poxY = posY;
    this.dir = dir;

    this.cleaned = new boolean[this.room.length][this.room[0].length];
  }

  @Override
  public boolean move() {
    int nX = this.posX + dirs[this.dir][0];
    int nY = this.poxY + dirs[this.dir][1];
    if (nX < 0 || nX > this.room.length - 1 || nY < 0 || nY > this.room[0].length - 1) {
      return false;
    }

    if (this.room[nX][nY] == 0) {
      return false;
    }

    this.posX = nX;
    this.poxY = nY;
    return true;
  }

  @Override
  public void turnLeft() {
    this.dir -= 1;
    if (this.dir < 0) {
      this.dir = 3;
    }
  }

  @Override
  public void turnRight() {
    this.dir += 1;
    this.dir %= dirs.length;
  }

  @Override
  public void clean() {
    this.cleaned[this.posX][this.poxY] = true;
  }

  boolean[][] getCleaned() {
    return this.cleaned;
  }
}
