package com.leetcode.algorithm.easy.findallanagramsinastring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
//  public List<Integer> findAnagrams(String s, String p) {
//    List<Integer> result = new ArrayList<>();
//
//    HashMap<Character, Integer> pmap = new HashMap<>();
//    for (char c: p.toCharArray()) {
//      pmap.put(c, pmap.getOrDefault(c, 0) + 1);
//    }
//
//    int i = 0;
//    HashMap<Character, Integer> smap = new HashMap<>();
//    char[] schars = s.toCharArray();
//    while (i < schars.length) {
//      smap.put(schars[i], smap.getOrDefault(schars[i], 0) + 1);
//
//      int start = i - p.length() + 1;
//      if (start >= 0) {
//        if (pmap.equals(smap)) {
//          result.add(start);
//        }
//
//        int count = smap.get(schars[start]);
//        if (count == 1) {
//          smap.remove(schars[start]);
//        } else {
//          smap.put(schars[start], count - 1);
//        }
//      }
//
//      i++;
//    }
//
//    return result;
//  }

//  public List<Integer> findAnagrams(String s, String t) {
//    List<Integer> result = new ArrayList<>();
//    if (t.length() > s.length()) {
//      return result;
//    }
//    HashMap<Character, Integer> map = new HashMap<>();
//    for (char c : t.toCharArray()) {
//      map.put(c, map.getOrDefault(c, 0) + 1);
//    }
//    int counter = map.size();
//
//    int begin = 0, end = 0;
//    int head = 0;
//    int len = Integer.MAX_VALUE;
//
//
//    while (end < s.length()) {
//      char c = s.charAt(end);
//      if (map.containsKey(c)) {
//        map.put(c, map.get(c) - 1);
//        if (map.get(c) == 0) {
//          counter--;
//        }
//      }
//      end++;
//
//      while (counter == 0) {
//        char tempc = s.charAt(begin);
//        if (map.containsKey(tempc)) {
//          map.put(tempc, map.get(tempc) + 1);
//          if (map.get(tempc) > 0) {
//            counter++;
//          }
//        }
//        if (end - begin == t.length()) {
//          result.add(begin);
//        }
//        begin++;
//      }
//
//    }
//    return result;
//  }

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    if (s == null || s.length() == 0 || p == null || p.length() == 0) {
      return result;
    }

    int[] hash = new int[256];
    for (char c: p.toCharArray()) {
      hash[c]++;
    }

    int left = 0, right = 0, count = p.length();
    while (right < s.length()) {
      char c = s.charAt(right);
      if (hash[c] >= 1) {
        count--;
      }

      hash[c]--;
      right++;

      if (count == 0) {
        result.add(left);
      }

      if (right - left == p.length()) {
        if (hash[s.charAt(left)] >= 0) {
          count++;
        }
        hash[s.charAt(left)]++;
        left++;
      }
    }

    return result;
  }
}
