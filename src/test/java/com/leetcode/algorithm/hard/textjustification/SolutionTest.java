package com.leetcode.algorithm.hard.textjustification;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("This    is    an", "example  of text", "justification.  "),
        solution.fullJustify(
            new String[] {"This", "is", "an", "example", "of", "text", "justification."}, 16));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("What   must   be", "acknowledgment  ", "shall be        "),
        solution.fullJustify(
            new String[] {"What", "must", "be", "acknowledgment", "shall", "be"}, 16));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        "Science  is  what we",
        "understand      well",
        "enough to explain to",
        "a  computer.  Art is",
        "everything  else  we",
        "do                  "
        ),
        solution.fullJustify(
            new String[] {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
                "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20));
  }
}
