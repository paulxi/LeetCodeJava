package com.leetcode.algorithm.hard.streamofcharacters;

class StreamChecker {
  private static final class Trie {
    Trie[] next = new Trie[26];
    boolean isEnd = false;
  }

  private Trie root;
  StringBuilder sb = new StringBuilder();

  public StreamChecker(String[] words) {
    root = new Trie();
    for (String word: words) {
      Trie curr = root;

      for (int i = word.length() - 1; i >= 0; i--) {
        char c = word.charAt(i);
        if (curr.next[c- 'a'] == null) {
          curr.next[c - 'a'] = new Trie();
        }
        curr = curr.next[c - 'a'];
      }
      curr.isEnd = true;
    }
  }

  public boolean query(char letter) {
    sb.append(letter);
    Trie curr = root;
    for (int i = sb.length() - 1; i >= 0; i--) {
      char c = sb.charAt(i);
      curr = curr.next[c - 'a'];
      if (curr == null) {
        return false;
      }
      if (curr.isEnd) {
        return true;
      }
    }

    return false;
  }
}
