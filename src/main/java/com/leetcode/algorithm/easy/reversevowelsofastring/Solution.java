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
      while (low < high && !vowels.contains(arr[low])) {
        low++;
      }

      while (low < high && !vowels.contains(arr[high])) {
        high--;
      }

      if (low < high) {
        char temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        low++;
        high--;
      }
    }

    return String.valueOf(arr);
  }
}
