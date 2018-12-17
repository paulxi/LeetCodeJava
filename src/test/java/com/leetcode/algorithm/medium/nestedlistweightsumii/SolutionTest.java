package com.leetcode.algorithm.medium.nestedlistweightsumii;

import com.leetcode.algorithm.common.NestedInteger;
import com.leetcode.algorithm.common.NestedIntegerInteger;
import com.leetcode.algorithm.common.NestedIntegerList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<NestedInteger> list = Arrays.asList(
        new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1)),
        new NestedIntegerInteger(2),
        new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1))
    );

    assertEquals(8, solution.depthSumInverse(list));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<NestedInteger> list = Arrays.asList(
        new NestedIntegerInteger(1),
        new NestedIntegerList(
            new NestedIntegerInteger(4),
            new NestedIntegerList(new NestedIntegerInteger(6))
        )
    );

    assertEquals(17, solution.depthSumInverse(list));
  }
}
