package com.leetcode.algorithm.medium.addandsearchword;

class WordDictionary {
  private static final class Trie {
    Trie[] next = new Trie[26];
    boolean isEnd = false;
  }

  private Trie root;

  /** Initialize your data structure here. */
  public WordDictionary() {
    root = new Trie();
  }

  /** Adds a word into the data structure. */
  public void addWord(String word) {
    Trie curr = root;
    for (char c: word.toCharArray()) {
      if (curr.next[c - 'a'] == null) {
        curr.next[c - 'a'] = new Trie();
      }

      curr = curr.next[c - 'a'];
    }
    curr.isEnd = true;
  }

  /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
  public boolean search(String word) {
    return dfs(root, word.toCharArray(), 0);
  }

  private boolean dfs(Trie trie, char[] word, int i) {
    if (i == word.length) {
      return trie.isEnd;
    }

    char c = word[i];
    if (c == '.') {
      for (int j = 0; j < trie.next.length; j++) {
        if (trie.next[j] != null) {
          if (dfs(trie.next[j], word, i + 1)) {
            return true;
          }
        }
      }
      return false;
    } else {
      if (trie.next[c - 'a'] == null) {
        return false;
      }
      return dfs(trie.next[c - 'a'], word, i + 1);
    }
  }
}
