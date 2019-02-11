package com.leetcode.algorithm.easy.findsmallestlettergreaterthantarget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals('c', solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a'));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals('f', solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c'));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals('f', solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'd'));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals('j', solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'g'));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals('c', solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'j'));
  }

  @Test
  public void testCase6() {
    Solution solution = new Solution();
    assertEquals('c', solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'k'));
  }
}
