package com.leetcode.algorithm.medium.subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
//  public List<List<Integer>> subsets(int[] nums) {
//    return calculate(nums);
//  }
//
//  private List<List<Integer>> calculate(int[] nums) {
//    if (nums.length == 0) {
//      return Arrays.asList(Arrays.asList());
//    }
//
//    List<List<Integer>> subSets = calculate(Arrays.copyOf(nums, nums.length - 1));
//
//    ArrayList<List<Integer>> result = new ArrayList<>(subSets);
//
//    for (List<Integer> list : subSets) {
//      ArrayList<Integer> copy = new ArrayList<>(list);
//      copy.add(nums[nums.length - 1]);
//      result.add(copy);
//    }
//
//    return result;
//  }

//  public List<List<Integer>> subsets(int[] nums) {
//    ArrayList<List<Integer>> result = new ArrayList<>();
//    result.add(new ArrayList<>());
//
//    for (int n : nums) {
//      int size = result.size();
//      for (int i = 0; i < size; i++) {
//        List<Integer> subset = new ArrayList<>(result.get(i));
//        subset.add(n);
//        result.add(subset);
//      }
//    }
//
//    return result;
//  }

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    helper(result, new ArrayList<>(), nums, 0);
    return result;
  }

  private void helper(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
    result.add(new ArrayList<>(temp));
    for (int i = start; i < nums.length; i++) {
      temp.add(nums[i]);
      helper(result, temp, nums, i + 1);
      temp.remove(temp.size() - 1);
    }
  }
}
