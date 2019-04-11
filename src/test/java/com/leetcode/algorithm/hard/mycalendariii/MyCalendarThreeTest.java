package com.leetcode.algorithm.hard.mycalendariii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyCalendarThreeTest {
  @Test
  public void testCase1() {
    MyCalendarThree calendar = new MyCalendarThree();

    assertEquals(1, calendar.book(10, 20));
    assertEquals(1, calendar.book(50, 60));
    assertEquals(2, calendar.book(10, 40));
    assertEquals(3, calendar.book(5, 15));
    assertEquals(3, calendar.book(5, 10));
    assertEquals(3, calendar.book(25, 55));
  }
}
