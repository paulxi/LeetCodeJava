package com.leetcode.algorithm.easy.countandsay;

class Solution {
//  public String countAndSay(int n) {
//    if (n == 1) {
//      return "1";
//    }
//
//    StringBuilder result = new StringBuilder();
//    String prev = countAndSay(n - 1);
//    char currChar = prev.charAt(0);
//    int count = 1;
//    for (int i = 1; i < prev.length(); i++) {
//      if (prev.charAt(i) == currChar) {
//        count += 1;
//      } else {
//        result.append(count);
//        result.append(currChar);
//        currChar = prev.charAt(i);
//        count = 1;
//      }
//    }
//
//    result.append(count);
//    result.append(currChar);
//
//    return result.toString();
//  }

  public String countAndSay(int n) {
    String result = "1";
    if (n == 1) {
      return result;
    }

    for (int i = 2; i <= n; i++) {
      StringBuilder newResult = new StringBuilder();
      char currChar = result.charAt(0);
      int count = 1;
      for (int j = 1; j < result.length(); j++) {
        if (result.charAt(j) == currChar) {
          count += 1;
        } else {
          newResult.append(count);
          newResult.append(currChar);
          currChar = result.charAt(j);
          count = 1;
        }
      }

      newResult.append(count);
      newResult.append(currChar);
      result = newResult.toString();
    }

    return result;
  }
}
