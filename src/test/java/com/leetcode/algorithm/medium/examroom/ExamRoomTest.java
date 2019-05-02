package com.leetcode.algorithm.medium.examroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamRoomTest {
  @Test
  public void testCase1() {
    ExamRoom room = new ExamRoom(10);
    assertEquals(0, room.seat());
    assertEquals(9, room.seat());
    assertEquals(4, room.seat());
    assertEquals(2, room.seat());
    room.leave(4);
    assertEquals(5, room.seat());
  }
}
