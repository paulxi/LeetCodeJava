package com.leetcode.algorithm.medium.summaryranges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<String> result = solution.summaryRanges(new int[] {0, 1, 2, 4, 5, 7});
    assertEquals(Arrays.asList("0->2", "4->5", "7"), result);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<String> result = solution.summaryRanges(new int[] {0, 2, 3, 4, 6, 8, 9});
    assertEquals(Arrays.asList("0", "2->4", "6", "8->9"), result);
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    List<String> result = solution.summaryRanges(new int[] {-2147483648, -2147483647, 2147483647});
    assertEquals(Arrays.asList("-2147483648->-2147483647", "2147483647"), result);
  }
}
