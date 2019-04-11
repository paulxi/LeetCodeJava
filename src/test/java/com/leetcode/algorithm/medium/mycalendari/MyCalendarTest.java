package com.leetcode.algorithm.medium.mycalendari;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyCalendarTest {
  @Test
  public void testCase1() {
    MyCalendar calendar = new MyCalendar();

    assertEquals(true, calendar.book(10, 20));
    assertEquals(false, calendar.book(15, 25));
    assertEquals(true, calendar.book(20, 30));
  }
}
