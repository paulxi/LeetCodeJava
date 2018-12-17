package com.leetcode.algorithm.easy.uniquemorsecodewords;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int uniqueMorseRepresentations(String[] words) {
    String[] moores = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--.."};

    Set<String> set = new HashSet<>();

    for (String word: words) {
      StringBuilder sb = new StringBuilder();
      for (char c: word.toCharArray()) {
        sb.append(moores[c - 'a']);
      }
      set.add(sb.toString());
    }

    return set.size();
  }
}
