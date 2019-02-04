package com.leetcode.algorithm.medium.searchinasortedarrayofunknownsize;

import com.leetcode.algorithm.common.ArrayReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    ArrayReader reader = new ArrayReader();
    int[] arr = new int[] {-1, 0, 3, 5, 9, 12};
    reader.function = (a) -> arr[a];
    assertEquals(4, solution.search(reader, 9));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    ArrayReader reader = new ArrayReader();
    int[] arr = new int[] {-1, 0, 3, 5, 9, 12};
    reader.function = (a) -> arr[a];
    assertEquals(-1, solution.search(reader, 2));
  }
}
