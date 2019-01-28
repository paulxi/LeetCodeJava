package com.leetcode.algorithm.easy.intersectionoftwoarraysii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
//  public int[] intersect(int[] nums1, int[] nums2) {
//    HashMap<Integer, Integer> map = new HashMap<>();
//
//    for (int num: nums1) {
//      map.put(num, map.getOrDefault(num, 0) + 1);
//    }
//
//    List<Integer> result = new ArrayList<>();
//    for (int num: nums2) {
//      if (map.containsKey(num)) {
//        result.add(num);
//        int count = map.get(num) - 1;
//        if (count == 0) {
//          map.remove(num);
//        } else {
//          map.put(num, count);
//        }
//      }
//    }
//
//    int[] ans = new int[result.size()];
//    for (int i = 0; i < ans.length; i++) {
//      ans[i] = result.get(i);
//    }
//
//    return ans;
//  }

  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0;
    int j = 0;

    ArrayList<Integer> result = new ArrayList<>();
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] > nums2[j]) {
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
        result.add(nums1[i]);
        i++;
        j++;
      }
    }

    int[] ans = new int[result.size()];
    for (int k = 0; k < ans.length; k++) {
      ans[k] = result.get(k);
    }

    return ans;
  }
}
