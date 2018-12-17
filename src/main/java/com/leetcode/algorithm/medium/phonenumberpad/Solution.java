package com.leetcode.algorithm.medium.phonenumberpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<List<Integer>> findValidNumbers(int digit, int lens) {
    int[][] matrix = new int[][] {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9},
      {-1, 0, -1}
    };

    HashMap<Integer, int[]> posMap = new HashMap<>();
    posMap.put(1, new int[] {0, 0});
    posMap.put(2, new int[] {0, 1});
    posMap.put(3, new int[] {0, 2});
    posMap.put(4, new int[] {1, 0});
    posMap.put(5, new int[] {1, 1});
    posMap.put(6, new int[] {1, 2});
    posMap.put(7, new int[] {2, 0});
    posMap.put(8, new int[] {2, 1});
    posMap.put(9, new int[] {2, 2});
    posMap.put(0, new int[] {3, 1});

    List<List<Integer>> result = new ArrayList<>();

    List<Integer> ans = new ArrayList<>();
    ans.add(digit);

    helper(result, matrix, posMap, digit, lens - 1, ans);
    return result;
  }

  private void helper(List<List<Integer>> result, int[][] matrix, HashMap<Integer, int[]> posMap,
                 int startDigit, int lens, List<Integer> ans) {
    if (lens == 0) {
      result.add(new ArrayList<>(ans));
      return;
    }

    int[] pos = posMap.get(startDigit);
    List<Integer> next = new ArrayList<>();
    if (pos[0] != 0) {
      int value = matrix[pos[0] - 1][pos[1]];
      if (value != -1) {
        next.add(value);
      }
    }

    if (pos[0] != matrix.length - 1) {
      int value = matrix[pos[0] + 1][pos[1]];
      if (value != -1) {
        next.add(value);
      }
    }

    if (pos[1] != 0) {
      int value = matrix[pos[0]][pos[1] - 1];
      if (value != -1) {
        next.add(value);
      }
    }

    if (pos[1] != matrix[0].length - 1) {
      int value = matrix[pos[0]][pos[1] + 1];
      if (value != -1) {
        next.add(value);
      }
    }

    for (int value: next) {
      ans.add(value);
      helper(result, matrix, posMap, value, lens - 1, ans);
      ans.remove(ans.size() - 1);
    }
  }
}
