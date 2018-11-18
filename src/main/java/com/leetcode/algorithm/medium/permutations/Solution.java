package com.leetcode.algorithm.medium.permutations;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
//  public List<List<Integer>> permute(int[] nums) {
//    if (nums.length == 0) {
//      return Arrays.asList(Arrays.asList());
//    }
//
//    List<List<Integer>> prev = permute(Arrays.copyOf(nums,nums.length - 1));
//
//    List<List<Integer>> result = new ArrayList<>();
//    for (List<Integer> list : prev) {
//      for (int i = 0; i <= list.size(); i++) {
//        LinkedList sublist = new LinkedList(list);
//        sublist.add(i, nums[nums.length - 1]);
//        result.add(sublist);
//      }
//    }
//
//    return result;
//  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = Arrays.asList(Arrays.asList());

    for (int num: nums) {
      List<List<Integer>> newResult = new LinkedList<>();
      for (int i = 0; i < result.size(); i++) {
        List<Integer> list = result.get(i);
        for (int j = 0; j <= list.size(); j++) {
          LinkedList<Integer> newList = new LinkedList<>(list);
          newList.add(j, num);
          newResult.add(newList);
        }
      }
      result = newResult;

    }
    return result;
  }
}
