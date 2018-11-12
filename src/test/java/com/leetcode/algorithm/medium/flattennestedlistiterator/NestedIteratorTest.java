package com.leetcode.algorithm.medium.flattennestedlistiterator;

import com.leetcode.algorithm.common.NestedInteger;
import com.leetcode.algorithm.common.NestedIntegerInteger;
import com.leetcode.algorithm.common.NestedIntegerList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedIteratorTest {
  @Test
  public void testCase1() {
    List<NestedInteger> input = new ArrayList();
    input.add(new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1)));
    input.add(new NestedIntegerInteger(2));
    input.add(new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1)));

    List<Integer> output = new ArrayList<>();
    NestedIterator iterator = new NestedIterator(input);
    while (iterator.hasNext()) {
      output.add(iterator.next());
    }
    assertEquals(Arrays.asList(1, 1, 2, 1, 1), output);
  }

  @Test
  public void testCase2() {
    List<NestedInteger> input = new ArrayList();
    input.add(new NestedIntegerInteger(1));
    input.add(new NestedIntegerList(new NestedIntegerInteger(4), new NestedIntegerList(new NestedIntegerInteger(6))));

    List<Integer> output = new ArrayList<>();
    NestedIterator iterator = new NestedIterator(input);
    while (iterator.hasNext()) {
      output.add(iterator.next());
    }
    assertEquals(Arrays.asList(1, 4, 6), output);
  }
}
