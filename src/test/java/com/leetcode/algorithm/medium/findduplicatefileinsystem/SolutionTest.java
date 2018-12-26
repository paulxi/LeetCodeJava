package com.leetcode.algorithm.medium.findduplicatefileinsystem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList("root/a/2.txt","root/c/d/4.txt","root/4.txt"),
        Arrays.asList("root/a/1.txt","root/c/3.txt")),
        solution.findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)",
            "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"}));
  }
}
