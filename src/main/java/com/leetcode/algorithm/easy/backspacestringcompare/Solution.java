package com.leetcode.algorithm.easy.backspacestringcompare;

class Solution {
//  public boolean backspaceCompare(String s, String t) {
//    if (s == null || t == null) {
//      return false;
//    }
//
//    return backspace(s).equals(backspace(t));
//  }
//
//  private String backspace(String str) {
//    StringBuilder sb = new StringBuilder();
//    for (char c: str.toCharArray()) {
//      if (c == '#') {
//        if (sb.length() > 0) {
//          sb.delete(sb.length() - 1, sb.length());
//        }
//      } else {
//        sb.append(c);
//      }
//    }
//
//    return sb.toString();
//  }

  public boolean backspaceCompare(String s, String t) {
    int i = s.length() - 1;
    int j = t.length() - 1;
    int skipS = 0;
    int skipT = 0;
    while (i >= 0 || j >= 0) {
      while (i >= 0) {
        if (s.charAt(i) == '#') {
          skipS++;
          i--;
        } else if (skipS > 0) {
          skipS--;
          i--;
        } else {
          break;
        }
      }

      while (j >= 0) {
        if (t.charAt(j) == '#') {
          skipT++;
          j--;
        } else if (skipT > 0) {
          skipT--;
          j--;
        } else {
          break;
        }
      }

      if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
        return false;
      }

      if ((i >= 0) != (j >= 0)) {
        return false;
      }

      i--;
      j--;
    }

    return true;
  }
}
