package com.leetcode.algorithm.medium.mycalendarii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyCalendarTwoTest {
  @Test
  public void testCase1() {
    MyCalendarTwo calendar = new MyCalendarTwo();

    assertEquals(true, calendar.book(10, 20));
    assertEquals(true, calendar.book(50, 60));
    assertEquals(true, calendar.book(10, 40));
    assertEquals(false, calendar.book(5, 15));
    assertEquals(true, calendar.book(5, 10));
    assertEquals(true, calendar.book(25, 55));
  }
}
