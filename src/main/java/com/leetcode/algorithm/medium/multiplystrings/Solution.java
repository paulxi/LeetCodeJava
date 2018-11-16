package com.leetcode.algorithm.medium.multiplystrings;

class Solution {
  public String multiply(String num1, String num2) {
    int m = num1.length();
    int n = num2.length();
    int[] pos = new int[m + n];

    for (int i = m - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int sum = mul + pos[i + j + 1];

        pos[i + j] += sum / 10;
        pos[i + j + 1] = sum % 10;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int p : pos) {
      if (!(sb.length() == 0 && p == 0)) {
        sb.append(p);
      }
    }

    return sb.length() == 0 ? "0" : sb.toString();
  }
}
