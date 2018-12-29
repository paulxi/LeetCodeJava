package com.leetcode.algorithm.hard.parselispexpression;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.evaluate("(add 1 2)"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(15, solution.evaluate("(mult 3 (add 2 3))"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(14, solution.evaluate("(let x 2 (mult x (let x 3 y 4 (add x y))))"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(2, solution.evaluate("(let x 3 x 2 x)"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(5, solution.evaluate("(let x 1 y 2 x (add x y) (add x y))"));
  }

  @Test
  public void testCase6() {
    Solution solution = new Solution();
    assertEquals(6, solution.evaluate("(let x 2 (add (let x 3 (let x 4 x)) x))"));
  }

  @Test
  public void testCase7() {
    Solution solution = new Solution();
    assertEquals(4, solution.evaluate("(let a1 3 b2 (add a1 1) b2)"));
  }
}
