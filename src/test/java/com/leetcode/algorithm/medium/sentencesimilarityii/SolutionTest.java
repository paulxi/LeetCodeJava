package com.leetcode.algorithm.medium.sentencesimilarityii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        true,
        solution.areSentencesSimilarTwo(
            new String[] {"great", "acting", "skills"},
            new String[] {"fine", "drama", "talent"},
            new String[][] {
              {"great", "good"}, {"fine", "good"}, {"acting", "drama"}, {"skills", "talent"}
            }));
  }
}
