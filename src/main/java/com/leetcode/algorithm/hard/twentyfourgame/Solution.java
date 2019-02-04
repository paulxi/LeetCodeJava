package com.leetcode.algorithm.hard.twentyfourgame;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public boolean judgePoint24(int[] nums) {
    List<Double> list = new ArrayList<>();
    for (int num: nums) {
      list.add((double) num);
    }
    return solve(list);
  }

  private boolean solve(List<Double> list) {
    if (list.size() == 0) {
      return false;
    }
    if (list.size() == 1) {
      return Math.abs(list.get(0) - 24) < 0.00001;
    }

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        if (i != j) {
          List<Double> nums = new ArrayList<>();
          for (int k = 0; k < list.size(); k++) {
            if (k != i && k != j) {
              nums.add(list.get(k));
            }
          }

          for (int k = 0; k < 4; k++) {
            if (k < 2 && j > i) {
              continue;
            }
            if (k == 0) {
              nums.add(list.get(i) + list.get(j));
            }
            if (k == 1) {
              nums.add(list.get(i) * list.get(j));
            }
            if (k == 2) {
              nums.add(list.get(i) - list.get(j));
            }
            if (k == 3) {
              if (list.get(j) != 0) {
                nums.add(list.get(i) / list.get(j));
              } else {
                continue;
              }
            }
            if (solve(nums)) {
              return true;
            }
            nums.remove(nums.size() - 1);
          }
        }
      }
    }

    return false;
  }
}
