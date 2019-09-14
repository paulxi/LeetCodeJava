package com.leetcode.algorithm.medium.keysandrooms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Solution {
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    Stack<Integer> stack = new Stack<>();
    stack.add(0);
    Set<Integer> seen = new HashSet<>();
    seen.add(0);
    while (!stack.isEmpty()) {
      int i = stack.pop();
      for (int j : rooms.get(i)) {
        if (!seen.contains(j)) {
          stack.push(j);
          seen.add(j);
          if (rooms.size() == seen.size()) {
            return true;
          }
        }
      }
    }
    return rooms.size() == seen.size();
  }
}
