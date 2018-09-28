package com.leetcode.algorithm.hard.integertoenglishwords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals("One Hundred Twenty Three", solution.numberToWords(123));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals("Twelve Thousand Three Hundred Forty Five", solution.numberToWords(12345));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
        solution.numberToWords(1234567));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();

    assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One",
        solution.numberToWords(1234567891));
  }
}

