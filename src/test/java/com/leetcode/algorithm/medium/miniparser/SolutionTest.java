package com.leetcode.algorithm.medium.miniparser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.NestedIntegerInteger;
import com.leetcode.algorithm.common.NestedIntegerList;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(new NestedIntegerInteger(324), solution.deserialize("324"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(new NestedIntegerList(new NestedIntegerInteger(123),
        new NestedIntegerList(new NestedIntegerInteger(456),
            new NestedIntegerList(new NestedIntegerInteger(789)))),
        solution.deserialize("[123,[456,[789]]]"));
  }
}
