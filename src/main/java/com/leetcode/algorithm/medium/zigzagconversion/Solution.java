package com.leetcode.algorithm.medium.zigzagconversion;

public class Solution {
  /**
   * ZigZag Conversion
   * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
   * (you may want to display this pattern in a fixed font for better legibility)
   * P   A   H   N
   * A P L S I I G
   * Y   I   R
   * And then read line by line: "PAHNAPLSIIGYIR".
   * @param s a given string
   * @param numRows number of rows
   * @return zigzag conversion result
   */
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      rows[i] = new StringBuilder();
    }

    int index = 0;
    boolean topToDown = true;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      rows[index].append(c);

      if (topToDown) {
        index++;
      } else {
        index--;
      }

      if (index < 0) {
        index = 1;
        topToDown = true;
      }

      if (index == numRows) {
        index -= 2;
        topToDown = false;
      }
    }

    StringBuilder strBuilder = new StringBuilder();
    for (StringBuilder row : rows) {
      strBuilder.append(row);
    }

    return strBuilder.toString();
  }
}
