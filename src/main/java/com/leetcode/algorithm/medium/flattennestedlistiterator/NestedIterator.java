package com.leetcode.algorithm.medium.flattennestedlistiterator;

import com.leetcode.algorithm.common.NestedInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIterator implements Iterator<Integer> {
  Stack<NestedInteger> stack = new Stack<>();
  public NestedIterator(List<NestedInteger> nestedList) {
    for (int i = nestedList.size() - 1; i >= 0; i--) {
      stack.push(nestedList.get(i));
    }
  }

  @Override
  public Integer next() {
    return stack.pop().getInteger();
  }

  @Override
  public boolean hasNext() {
    while (!stack.isEmpty()) {
      NestedInteger elem = stack.peek();
      if (elem.isInteger()) {
        return true;
      } else {
        stack.pop();
        List<NestedInteger> nestedList = elem.getList();
        for (int i = nestedList.size() - 1; i >= 0; i--) {
          stack.push(nestedList.get(i));
        }
      }
    }
    return false;
  }
}
