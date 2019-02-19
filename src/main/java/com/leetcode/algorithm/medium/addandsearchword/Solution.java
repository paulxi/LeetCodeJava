package com.leetcode.algorithm.medium.addandsearchword;

class WordDictionary {

  private static class Trie {
    Trie[] next;
    char c;
    boolean end;

    Trie(char c, boolean end) {
      this.c = c;
      this.end = end;
      next = new Trie[26];
    }
  }

  private Trie root;
  /** Initialize your data structure here. */
  public WordDictionary() {
    root = new Trie('0', false);
  }

  /** Adds a word into the data structure. */
  public void addWord(String word) {
    Trie prev = root;
    char[] chars = word.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      Trie curr = prev.next[c - 'a'];
      if (curr != null) {
        if (i == chars.length - 1) {
          curr.end = true;
        }
      } else {
        if (i == chars.length - 1) {
          curr = new Trie(c, true);
        } else {
          curr = new Trie(c, false);
        }
      }

      prev.next[c - 'a'] = curr;
      prev = curr;
    }
  }

  /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
  public boolean search(String word) {
    return helper(word.toCharArray(), 0, root);
  }

  private boolean helper(char[] chars, int start, Trie node) {
    if (start == chars.length) {
      return node.end;
    }

    if (chars[start] != '.') {
      Trie next = node.next[chars[start] - 'a'];
      return next != null && helper(chars, start + 1, next);
    } else {
      for (int i = 0; i < node.next.length; i++) {
        Trie next = node.next[i];
        if (next != null) {
          if (helper(chars, start + 1, next)) {
            return true;
          }
        }
      }
    }

    return false;
  }
}
