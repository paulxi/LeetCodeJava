package com.leetcode.algorithm.medium.shortestworddistanceii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordDistanceTest {
  @Test
  public void testCase1() {
    WordDistance wordDistance = new WordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"});
    assertEquals(3, wordDistance.shortest("coding", "practice"));
    assertEquals(1, wordDistance.shortest("makes", "coding"));
  }
}
