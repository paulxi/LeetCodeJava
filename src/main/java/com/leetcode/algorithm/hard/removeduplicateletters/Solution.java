package com.leetcode.algorithm.hard.removeduplicateletters;

class Solution {
//  public String removeDuplicateLetters(String s) {
//    if (s.length() <= 1) {
//      return s;
//    }
//
//    String c = s.substring(0, 1);
//    String sub = s.substring(1);
//
//    if (sub.contains(c)) {
//      String str1 = removeDuplicateLetters(sub);
//      sub = sub.replace(c, "");
//      String str2 = c + removeDuplicateLetters(sub);
//
//      return str1.compareTo(str2) < 0 ? str1 : str2;
//    } else {
//      return c + removeDuplicateLetters(sub);
//    }
//  }
  public String removeDuplicateLetters(String s) {
    if (s.length() <= 1) {
      return s;
    }

    int[] cnt = new int[26];
    for (int i = 0; i < s.length(); i++) {
      cnt[s.charAt(i) - 'a'] += 1;
    }

    int pos = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) < s.charAt(pos)) {
        pos = i;
      }
      int index = s.charAt(i) - 'a';
      cnt[index] -= 1;
      if (cnt[index] == 0) {
        break;
      }
    }

    String c = s.substring(pos, pos + 1);

    return c + removeDuplicateLetters(s.substring(pos + 1).replace(c, ""));
  }
}
