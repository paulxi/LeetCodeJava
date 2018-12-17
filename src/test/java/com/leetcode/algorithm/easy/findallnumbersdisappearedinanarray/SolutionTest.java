package com.leetcode.algorithm.easy.findallnumbersdisappearedinanarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(5, 6), solution.findDisappearedNumbers(new int[] {4, 3, 2, 7, 8, 2, 3, 1}));
  }
}
