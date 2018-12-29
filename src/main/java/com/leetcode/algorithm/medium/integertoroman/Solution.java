package com.leetcode.algorithm.medium.integertoroman;

class Solution {
//  public String intToRoman(int num) {
//    StringBuilder sb = new StringBuilder();
//
//    int thousand = num / 1000;
//    int remainder = num % 1000;
//
//    for (int i = 0; i < thousand; i++) {
//      sb.append("M");
//    }
//
//    int hundred = remainder / 100;
//    remainder = remainder % 100;
//
//    if (hundred >= 5) {
//      if (hundred == 9) {
//        sb.append("CM");
//      } else {
//        sb.append("D");
//        for (int i = 0; i < hundred - 5; i++) {
//          sb.append("C");
//        }
//      }
//    } else {
//      if (hundred == 4) {
//        sb.append("CD");
//      } else {
//        for (int i = 0; i < hundred; i++) {
//          sb.append("C");
//        }
//      }
//    }
//
//    int ten = remainder / 10;
//    remainder = remainder % 10;
//
//    if (ten >= 5) {
//      if (ten == 9) {
//        sb.append("XC");
//      } else {
//        sb.append("L");
//        for (int i = 0; i < ten - 5; i++) {
//          sb.append("X");
//        }
//      }
//    } else {
//      if (ten == 4) {
//        sb.append("XL");
//      } else {
//        for (int i = 0; i < ten; i++) {
//          sb.append("X");
//        }
//      }
//    }
//
//    if (remainder >= 5) {
//      if (remainder == 9) {
//        sb.append("IX");
//      } else {
//        sb.append("V");
//        for (int i = 0; i < remainder - 5; i++) {
//          sb.append("I");
//        }
//      }
//    } else {
//      if (remainder == 4) {
//        sb.append("IV");
//      } else {
//        for (int i = 0; i < remainder; i++) {
//          sb.append("I");
//        }
//      }
//    }
//
//    return sb.toString();
//  }

  public String intToRoman(int num) {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
      while (num >= values[i]) {
        num -= values[i];
        sb.append(strs[i]);
      }
    }

    return sb.toString();
  }
}
