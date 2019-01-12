package com.leetcode.algorithm.medium.topkfrequentwords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("i", "love"), solution.topKFrequent(new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("the", "is", "sunny", "day"), solution.topKFrequent(new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
  }
}
