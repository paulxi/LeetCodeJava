package com.leetcode.algorithm.easy.goatlatin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
        solution.toGoatLatin("I speak Goat Latin"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
        solution.toGoatLatin("The quick brown fox jumped over the lazy dog"));
  }
}
