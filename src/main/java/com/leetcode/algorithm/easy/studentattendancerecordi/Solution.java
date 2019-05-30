package com.leetcode.algorithm.easy.studentattendancerecordi;

class Solution {
  public boolean checkRecord(String s) {
    int counta = 0;
    int countl = 0;
    for (char c: s.toCharArray()) {
      if (c == 'A') {
        counta++;
        countl = 0;
      } else if (c == 'L') {
        countl++;
      } else {
        countl = 0;
      }

      if (counta > 1 || countl > 2) {
        return false;
      }
    }

    return true;
  }
}
