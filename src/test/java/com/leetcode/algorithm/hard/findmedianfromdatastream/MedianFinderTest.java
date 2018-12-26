package com.leetcode.algorithm.hard.findmedianfromdatastream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MedianFinderTest {
  @Test
  public void testCase1() {
    MedianFinder finder = new MedianFinder();
    finder.addNum(2);
    finder.addNum(3);
    finder.addNum(4);
    assertEquals(3, finder.findMedian());
  }

  @Test
  public void testCase2() {
    MedianFinder finder = new MedianFinder();
    finder.addNum(2);
    finder.addNum(3);
    assertEquals(2.5, finder.findMedian());
  }
}
