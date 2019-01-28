package com.leetcode.algorithm.easy.addstrings;

class Solution {
  public String addStrings(String num1, String num2) {
    char[] digit1 = new StringBuilder(num1).reverse().toString().toCharArray();
    char[] digit2 = new StringBuilder(num2).reverse().toString().toCharArray();

    int len = digit1.length > digit2.length ? digit1.length : digit2.length;
    char[] result = new char[len];

    int index = 0;
    int carry = 0;
    while (index < digit1.length && index < digit2.length) {
      int m = digit1[index] - '0';
      int n = digit2[index] - '0';
      int sum = m + n + carry;
      result[index] = (char) ('0' + sum % 10);
      carry = sum / 10;

      index++;
    }

    char[] digit = null;
    if (index < digit1.length) {
      digit = digit1;
    }
    if (index < digit2.length) {
      digit = digit2;
    }

    if (digit != null) {
      for (int i = index; i < digit.length; i++) {
        int sum = digit[i] - '0' + carry;
        result[i] = (char) ('0' + sum % 10);
        carry = sum / 10;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(String.valueOf(result));
    if (carry > 0) {
      sb.append(carry);
    }

    return sb.reverse().toString();
  }
}
