package com.leetcode.algorithm.medium.timehashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeHashMapTest {
  @Test
  public void testCase1() {
    TimeHashMap map = new TimeHashMap();
    map.put("K", 1.0, "K1");
    map.put("K", 2.0, "K2");
    assertEquals(null, map.get("K", 0.9));
    assertEquals("K1", map.get("K", 1.0));
    assertEquals("K1", map.get("K", 1.5));
    assertEquals("K2", map.get("K", 2.0));
    assertEquals("K2", map.get("K", 2.2));
  }
}
