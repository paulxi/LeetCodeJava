package com.leetcode.algorithm.easy.romantointeger;

public class Solution {
  public int romanToInt(String s) {
    return convert(0, s);
  }

  private int convert(int sum, String str) {
    int length = str.length();
    if (length == 0) {
      return sum;
    } else if (length == 1) {
      return sum + getValue(str);
    } else {
      String twoChars = str.substring(0, 2);
      String restStr = str.substring(2);
      switch (twoChars) {
        case "IV": return convert(4 + sum, restStr);
        case "IX": return convert(9 + sum, restStr);
        case "XL": return convert(40 + sum, restStr);
        case "XC": return convert(90 + sum, restStr);
        case "CD": return convert(400 + sum, restStr);
        case "CM": return convert(900 + sum, restStr);
        default: return convert(sum + getValue(str.substring(0, 1)), str.substring(1));
      }
    }
  }

  private int getValue(String singleCharStr) {
    switch (singleCharStr) {
      case "I": return 1;
      case "V": return 5;
      case "X": return 10;
      case "L": return 50;
      case "C": return 100;
      case "D": return 500;
      case "M": return 1000;
      default: return 0;
    }
  }

}
