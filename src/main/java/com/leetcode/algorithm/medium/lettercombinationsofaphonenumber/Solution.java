package com.leetcode.algorithm.medium.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  private final static Map<Character, String[]> LetterValues = new HashMap<>();

  static {
    LetterValues.put('2', new String[]{"a", "b", "c"});
    LetterValues.put('3', new String[]{"d", "e", "f"});
    LetterValues.put('4', new String[]{"g", "h", "i"});
    LetterValues.put('5', new String[]{"j", "k", "l"});
    LetterValues.put('6', new String[]{"m", "n", "o"});
    LetterValues.put('7', new String[]{"p", "q", "r", "s"});
    LetterValues.put('8', new String[]{"t", "u", "v"});
    LetterValues.put('9', new String[]{"w", "x", "y", "z"});
  }

  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits.length() == 0) {
      return result;
    }
    appendLetter(result, digits, "", 0);
    return result;
  }

  private void appendLetter(List<String> result, String digits, String str, int index) {
    if (index == digits.length()) {
      result.add(str);
      return;
    }

    char c = digits.charAt(index);
    for (String s : LetterValues.get(c)) {
      appendLetter(result, digits, str + s, index + 1);
    }
  }
}
