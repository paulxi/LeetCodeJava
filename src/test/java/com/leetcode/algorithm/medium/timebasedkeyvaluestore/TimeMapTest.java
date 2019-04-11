package com.leetcode.algorithm.medium.timebasedkeyvaluestore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeMapTest {
  @Test
  public void testCase1() {
    TimeMap map = new TimeMap();
    map.set("foo", "bar", 1);
    assertEquals("bar", map.get("foo", 1));
    assertEquals("bar", map.get("foo", 3));
    map.set("foo", "bar2", 4);
    assertEquals("bar2", map.get("foo", 4));
    assertEquals("bar2", map.get("foo", 5));
  }
}
