package com.leetcode.algorithm.medium.replacewords;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  private static class Trie {
    String word;
    Map<Character, Trie> children = new HashMap<>();
  }

  private Trie root = new Trie();

  public String replaceWords(List<String> dict, String sentence) {
    for (String word: dict) {
      Trie curr = root;

      for (char c: word.toCharArray()) {
        Trie t = curr.children.get(c);
        if (t == null) {
          t = new Trie();
          curr.children.put(c, t);
        }
        curr = t;
      }

      curr.word = word;
    }


    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      Trie curr = root;
      for (char c: word.toCharArray()) {
        Trie t = curr.children.get(c);
        if (t == null) {
          break;
        }

        if (t.word != null) {
          words[i] = t.word;
          break;
        }

        curr = t;
      }
    }
    return String.join(" ", words);
  }
}
