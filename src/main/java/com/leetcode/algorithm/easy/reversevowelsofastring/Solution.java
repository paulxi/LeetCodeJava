package com.leetcode.algorithm.easy.reversevowelsofastring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public String reverseVowels(String s) {
    char[] arr = s.toCharArray();
    int low = 0;
    int high = arr.length - 1;
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    while (low < high) {
      char lowChar = arr[low];
      char highChar = arr[high];

      if (vowels.contains(lowChar) && vowels.contains(highChar)) {
        char temp = lowChar;
        arr[low] = highChar;
        arr[high] = temp;
        low += 1;
        high -= 1;
      } else if (!vowels.contains(lowChar) && !vowels.contains(highChar)) {
        low += 1;
        high -= 1;
      } else if (!vowels.contains(lowChar)) {
        low += 1;
      } else {
        high -= 1;
      }
    }

    return String.valueOf(arr);
  }
}
