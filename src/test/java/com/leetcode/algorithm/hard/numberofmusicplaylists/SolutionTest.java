package com.leetcode.algorithm.hard.numberofmusicplaylists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.numMusicPlaylists(3, 3, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(6, solution.numMusicPlaylists(2, 3, 0));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(2, solution.numMusicPlaylists(2, 3, 1));
  }
}
