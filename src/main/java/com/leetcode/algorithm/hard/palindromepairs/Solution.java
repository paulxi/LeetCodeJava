package com.leetcode.algorithm.hard.palindromepairs;

import java.util.*;

class Solution {
//  public List<List<Integer>> palindromePairs(String[] words) {
//    ArrayList<List<Integer>> result = new ArrayList<>();
//    for (int i = 0; i < words.length; i++) {
//      for (int j = 0; j < words.length; j++) {
//        if (i != j && isPalindrome(words[i], words[j])) {
//          result.add(Arrays.asList(i, j));
//        }
//      }
//    }
//
//    return result;
//  }
//
  private boolean isPalindrome(String str) {
    char[] arr = str.toCharArray();
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      if (arr[low] != arr[high]) {
        return false;
      }
      low += 1;
      high -= 1;
    }

    return true;
  }

  public List<List<Integer>> palindromePairs(String[] words) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
      map.put(words[i], i);
    }

    Set<List<Integer>> set = new HashSet<>();
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      for (int j = 0; j <= word.length(); j++) {
        String prefix = word.substring(0, j);
        String suffix = word.substring(j);

        if (isPalindrome(prefix)) {
          String rev = new StringBuilder(suffix).reverse().toString();
          if (map.containsKey(rev) && map.get(rev) != i) {
            set.add(Arrays.asList(map.get(rev), i));
          }
        }

        if (isPalindrome(suffix)) {
          String rev = new StringBuilder(prefix).reverse().toString();
          if (map.containsKey(rev) && map.get(rev) != i) {
            set.add(Arrays.asList(i, map.get(rev)));
          }
        }
      }
    }


    List<List<Integer>> result = new ArrayList<>(set);
    return result;
  }
}
