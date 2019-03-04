package com.leetcode.algorithm.medium.mapsumpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapSumTest {
  @Test
  public void testCase1() {
    MapSum mapSum = new MapSum();
    mapSum.insert("apple", 3);
    assertEquals(3, mapSum.sum("ap"));
    mapSum.insert("app", 2);
    assertEquals(5, mapSum.sum("ap"));
  }

  @Test
  public void testCase2() {
    MapSum mapSum = new MapSum();
    mapSum.insert("aa", 3);
    assertEquals(3, mapSum.sum("a"));
    mapSum.insert("aa", 2);
    assertEquals(2, mapSum.sum("a"));
  }
}
