package com.leetcode.algorithm.easy.movingaveragefromdatastream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MovingAverageTest {
  @Test
  public void testCase1() {
    MovingAverage m = new MovingAverage(3);
    assertEquals(1.0, m.next(1));
    assertEquals(5.5, m.next(10));
    assertEquals(14.0/3.0, m.next(3), 0.001);
    assertEquals(6.0, m.next(5));
  }
}
