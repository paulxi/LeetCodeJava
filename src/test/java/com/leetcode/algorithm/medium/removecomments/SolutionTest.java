package com.leetcode.algorithm.medium.removecomments;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("int main()", "{ ", "  ", "int a, b, c;", "a = b + c;", "}"),
        solution.removeComments(new String[] {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("ab"),
        solution.removeComments(new String[] {"a/*comment", "line", "more_comment*/b"}));
  }
}
