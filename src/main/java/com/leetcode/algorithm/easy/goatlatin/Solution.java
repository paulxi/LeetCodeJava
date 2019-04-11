package com.leetcode.algorithm.easy.goatlatin;

class Solution {
  public String toGoatLatin(String s) {
    if (s.length() < 1) {
      return "";
    }

    String[] words = s.split(" ");
    String[] result = new String[words.length];

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      StringBuilder sb = new StringBuilder();

      if ("aeiouAEIOU".contains(word.substring(0, 1))) {
        sb.append(word).append("ma");
      } else {
        sb.append(word.substring(1)).append(word.substring(0, 1)).append("ma");
      }

      for (int j = 0; j <= i; j++) {
        sb.append('a');
      }

      result[i] = sb.toString();
    }
    return String.join(" ", result);
  }
}
