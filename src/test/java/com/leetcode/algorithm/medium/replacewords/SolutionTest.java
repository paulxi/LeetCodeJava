package com.leetcode.algorithm.medium.replacewords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("the cat was rat by the bat",
        solution.replaceWords(Arrays.asList("cat", "bat", "rat"), "the cattle was rattled by the battery"));
  }
}
