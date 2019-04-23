package com.leetcode.algorithm.hard.tagvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isValid("<DIV>This is the first line <![CDATA[<div>]]></DIV>"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.isValid("<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false, solution.isValid("<A>  <B> </A>   </B>"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(false, solution.isValid("<DIV>  div tag is not closed  <DIV>"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(false, solution.isValid("<DIV>  unmatched <  </DIV>"));
  }

  @Test
  public void testCase6() {
    Solution solution = new Solution();
    assertEquals(
        false, solution.isValid("<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"));
  }

  @Test
  public void testCase7() {
    Solution solution = new Solution();
    assertEquals(
        false,
        solution.isValid(
            "<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>"));
  }

  @Test
  public void testCase8() {
    Solution solution = new Solution();
    assertEquals(
        false,
        solution.isValid("<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"));
  }
}
