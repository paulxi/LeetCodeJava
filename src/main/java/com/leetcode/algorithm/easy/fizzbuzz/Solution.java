package com.leetcode.algorithm.easy.fizzbuzz;

import java.util.*;

public class Solution {
//  public List<String> fizzBuzz(int n) {
//    List<String> result = new ArrayList<>(n);
//    for (int i = 0; i < n; i++) {
//      int value = i + 1;
//      if (value % 15 == 0) {
//        result.add("FizzBuzz");
//      } else if (value % 5 == 0) {
//        result.add("Buzz");
//      } else if (value % 3 == 0) {
//        result.add("Fizz");
//      } else {
//        result.add(String.valueOf(value));
//      }
//    }
//
//    return result;
//  }

  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>(n);

    HashMap<Integer, String> map = new HashMap<>();
    map.put(3, "Fizz");
    map.put(5, "Buzz");

    Set<Integer> keys = new TreeSet<>();
    keys.add(3);
    keys.add(5);

    for (int i = 1; i <= n; i++) {
      String str = "";
      for (int key: keys) {
        if (i % key == 0) {
          str += map.get(key);
        }
      }

      if (str == "") {
        str = String.valueOf(i);
      }
      result.add(str);
    }
    return result;
  }
}
