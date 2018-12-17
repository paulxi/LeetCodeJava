package com.leetcode.algorithm.easy.nestedlistweightsum;

import com.leetcode.algorithm.common.NestedInteger;
import com.leetcode.algorithm.common.NestedIntegerInteger;
import com.leetcode.algorithm.common.NestedIntegerList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    List<NestedInteger> input = new ArrayList();
    input.add(new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1)));
    input.add(new NestedIntegerInteger(2));
    input.add(new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1)));

    Solution solution = new Solution();
    assertEquals(10, solution.depthSum(input));
  }

  @Test
  public void testCase2() {
    List<NestedInteger> input = new ArrayList();
    input.add(new NestedIntegerInteger(1));
    input.add(new NestedIntegerList(new NestedIntegerInteger(4), new NestedIntegerList(new NestedIntegerInteger(6))));

    Solution solution = new Solution();
    assertEquals(27, solution.depthSum(input));
  }
}

