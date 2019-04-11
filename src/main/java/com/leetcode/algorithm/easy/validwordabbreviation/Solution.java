package com.leetcode.algorithm.easy.validwordabbreviation;

class Solution {
  public boolean validWordAbbreviation(String word, String abbr) {
    int indexW = 0;
    int indexA = 0;

    while (indexA < abbr.length() && indexW < word.length()) {
      char c = abbr.charAt(indexA);

      if (c > '0' && c <= '9') {
        int num = c - '0';

        while (indexA + 1 < abbr.length()) {
          char c1 = abbr.charAt(indexA + 1);
          if (c1 >= '0' && c1 <= '9') {
            indexA++;
            num = num * 10 + (c1 - '0');
          } else {
            break;
          }
        }
        indexA++;
        indexW += num;
      } else {
        if (word.charAt(indexW) == c) {
          indexW++;
          indexA++;
        } else {
          return false;
        }
      }
    }

    return indexA == abbr.length() && indexW == word.length();
  }
}
