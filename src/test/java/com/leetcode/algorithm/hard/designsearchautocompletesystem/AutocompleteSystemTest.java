package com.leetcode.algorithm.hard.designsearchautocompletesystem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutocompleteSystemTest {
  @Test
  public void testCase1() {
    String[] sentences = new String[] {"i love you", "island","ironman", "i love leetcode"};
    int[] times = new int[] {5,3,2,2};
    AutocompleteSystem solution = new AutocompleteSystem(sentences, times);

    assertEquals(Arrays.asList("i love you", "island","i love leetcode"), solution.input('i'));
    assertEquals(Arrays.asList("i love you","i love leetcode"), solution.input(' '));
    assertEquals(Arrays.asList(), solution.input('a'));
    assertEquals(Arrays.asList(), solution.input('#'));
  }
}
