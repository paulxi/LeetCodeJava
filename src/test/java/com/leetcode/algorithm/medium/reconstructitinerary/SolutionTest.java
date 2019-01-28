package com.leetcode.algorithm.medium.reconstructitinerary;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"),
        solution.findItinerary(new String[][] {
            {"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}
        }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("JFK","ATL","JFK","SFO","ATL","SFO"),
        solution.findItinerary(new String[][] {
            {"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}
        }));
  }
}
