package com.leetcode.algorithm.hard.integertoenglishwords;

import java.util.HashMap;
import java.util.Map;

class Solution {
  private final static int BILLION = 1000 * 1000 * 1000;
  private final static int MILLION = 1000 * 1000;
  private final static Map<Integer, String> VALUE_MAP = new HashMap<>();

  static {
    VALUE_MAP.put(BILLION, "Billion");
    VALUE_MAP.put(MILLION, "Million");
    VALUE_MAP.put(1000, "Thousand");
    VALUE_MAP.put(100, "Hundred");
    VALUE_MAP.put(90, "Ninety");
    VALUE_MAP.put(80, "Eighty");
    VALUE_MAP.put(70, "Seventy");
    VALUE_MAP.put(60, "Sixty");
    VALUE_MAP.put(50, "Fifty");
    VALUE_MAP.put(40, "Forty");
    VALUE_MAP.put(30, "Thirty");
    VALUE_MAP.put(20, "Twenty");
    VALUE_MAP.put(19, "Nineteen");
    VALUE_MAP.put(18, "Eighteen");
    VALUE_MAP.put(17, "Seventeen");
    VALUE_MAP.put(16, "Sixteen");
    VALUE_MAP.put(15, "Fifteen");
    VALUE_MAP.put(14, "Fourteen");
    VALUE_MAP.put(13, "Thirteen");
    VALUE_MAP.put(12, "Twelve");
    VALUE_MAP.put(11, "Eleven");
    VALUE_MAP.put(10, "Ten");
    VALUE_MAP.put(9, "Nine");
    VALUE_MAP.put(8, "Eight");
    VALUE_MAP.put(7, "Seven");
    VALUE_MAP.put(6, "Six");
    VALUE_MAP.put(5, "Five");
    VALUE_MAP.put(4, "Four");
    VALUE_MAP.put(3, "Three");
    VALUE_MAP.put(2, "Two");
    VALUE_MAP.put(1, "One");
    VALUE_MAP.put(0, "Zero");
  }


  public String numberToWords(int num) {
    if (num == 0) {
      return VALUE_MAP.get(0);
    }


    return convertToWords(num);
  }

  private String convertToWords(int num) {
    if (num == 0) {
      return "";
    }
    int div = num / BILLION;
    int remainder = num % BILLION;
    String result = "";
    if (div > 0) {
      result += convertToWords(div) + " " + VALUE_MAP.get(BILLION);
    } else {
      div = num / MILLION;
      remainder = num % MILLION;

      if (div > 0) {
        result += convertToWords(div) + " " + VALUE_MAP.get(MILLION);
      } else {
        div = num / 1000;
        remainder = num % 1000;

        if (div > 0) {
          result += convertToWords(div) + " " + VALUE_MAP.get(1000);
        } else {
          div = num / 100;
          remainder = num % 100;

          if (div > 0) {
            result += convertToWords(div) + " " + VALUE_MAP.get(100);
          } else {
            if (num >= 90) {
              result += VALUE_MAP.get(90);
              remainder = num - 90;
            } else if (num >= 80) {
              result += VALUE_MAP.get(80);
              remainder = num - 80;
            } else if (num >= 70) {
              result += VALUE_MAP.get(70);
              remainder = num - 70;
            } else if (num >= 60) {
              result += VALUE_MAP.get(60);
              remainder = num - 60;
            } else if (num >= 50) {
              result += VALUE_MAP.get(50);
              remainder = num - 50;
            } else if (num >= 40) {
              result += VALUE_MAP.get(40);
              remainder = num - 40;
            } else if (num >= 30) {
              result += VALUE_MAP.get(30);
              remainder = num - 30;
            } else if (num >= 20) {
              result +=  VALUE_MAP.get(20);
              remainder = num - 20;
            } else {
              result += VALUE_MAP.get(num);
              remainder = 0;
            }
          }
        }
      }
    }


    if (remainder > 0) {
      if (div > 0 || num < 100) {
        result += " ";
      }
      result += convertToWords(remainder);
    }

    return result;
  }
}
