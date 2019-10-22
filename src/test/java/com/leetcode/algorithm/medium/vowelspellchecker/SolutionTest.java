package com.leetcode.algorithm.medium.vowelspellchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new String[] {"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"},
        solution.spellchecker(
            new String[] {"KiTe", "kite", "hare", "Hare"},
            new String[] {
              "kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"
            }));
  }
}
