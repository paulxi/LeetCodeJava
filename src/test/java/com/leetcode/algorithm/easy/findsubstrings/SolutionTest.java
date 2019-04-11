package com.leetcode.algorithm.easy.findsubstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new String[] {"Apple", "Me[lon]", "Or[a]nge", "Water[mel]on"},
        solution.findSubstrings(
        new String[] {"Apple", "Melon", "Orange", "Watermelon"},
        new String[] {"a", "mel", "lon", "el", "An"}));
  }
}
