package com.leetcode.algorithm.medium.searchsuggestionssystem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            Arrays.asList("mobile", "moneypot", "monitor"),
            Arrays.asList("mobile", "moneypot", "monitor"),
            Arrays.asList("mouse", "mousepad"),
            Arrays.asList("mouse", "mousepad"),
            Arrays.asList("mouse", "mousepad")),
        solution.suggestedProducts(
            new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana"),
            Arrays.asList("havana")),
        solution.suggestedProducts(new String[] {"havana"}, "havana"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            Arrays.asList("baggage", "bags", "banner"),
            Arrays.asList("baggage", "bags", "banner"),
            Arrays.asList("baggage", "bags"),
            Arrays.asList("bags")),
        solution.suggestedProducts(
            new String[] {"bags", "baggage", "banner", "box", "cloths"}, "bags"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList()),
        solution.suggestedProducts(new String[] {"havana"}, "tatiana"));
  }
}
