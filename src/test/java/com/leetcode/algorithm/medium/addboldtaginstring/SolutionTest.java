package com.leetcode.algorithm.medium.addboldtaginstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("<b>abc</b>xyz<b>123</b>", solution.addBoldTag("abcxyz123", new String[] {
        "abc","123"
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("<b>aaabbc</b>c", solution.addBoldTag("aaabbcc", new String[] {
        "aaa","aab","bc"
    }));
  }
}
