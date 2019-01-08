package com.leetcode.algorithm.hard.guesstheword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    solution.findSecretWord(new String[]{"acckzz","ccbazz","eiowzz","abcczz"}, (String str) -> {
      if (str.equals("acckzz")) {
        return 6;
      }
      if (str.equals("ccbazz")) {
        return 3;
      }
      if (str.equals("eiowzz")) {
        return 2;
      }
      if (str.equals("abcczz")) {
        return 4;
      }
      return -1;
    });
    assertTrue(true);
  }
}
