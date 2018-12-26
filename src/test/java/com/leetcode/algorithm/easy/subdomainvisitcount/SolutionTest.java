package com.leetcode.algorithm.easy.subdomainvisitcount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("9001 com", "9001 leetcode.com", "9001 discuss.leetcode.com"),
        solution.subdomainVisits(new String[] {"9001 discuss.leetcode.com"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("951 com", "900 google.mail.com", "1 intel.mail.com", "5 org", "5 wiki.org", "901 mail.com", "50 yahoo.com"),
        solution.subdomainVisits(new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
  }
}
