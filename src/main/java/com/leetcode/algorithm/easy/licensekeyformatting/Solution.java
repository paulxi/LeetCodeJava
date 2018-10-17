package com.leetcode.algorithm.easy.licensekeyformatting;

class Solution {
  public String licenseKeyFormatting(String s, int k) {
    StringBuilder result = new StringBuilder();
    String str = String.join("", s.split("-")).toUpperCase();

    for (int i = 0; i < str.length(); i++) {
      int index = str.length() - i - 1;
      char c = str.charAt(index);

      if (i % k == 0 && i != 0) {
        result.insert(0, "-");
      }

      result.insert(0, c);
    }

    return result.toString();
  }
}

