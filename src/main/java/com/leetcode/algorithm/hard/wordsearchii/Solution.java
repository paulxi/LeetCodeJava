package com.leetcode.algorithm.hard.wordsearchii;

import java.util.ArrayList;
import java.util.List;

class Solution {
  static class Trie {
    Trie[] next = new Trie[26];
    String word;
  }

  public List<String> findWords(char[][] board, String[] words) {
    List<String> result = new ArrayList<>();
    Trie root = buildTrie(words);
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        dfs(board, i, j, root, result);
      }
    }

    return result;
  }

  private void dfs(char[][] board, int i, int j, Trie p, List<String> res) {
    char c = board[i][j];
    if (c == '#' || p.next[c - 'a'] == null) {
      return;
    }

    p = p.next[c - 'a'];
    if (p.word != null) {
      res.add(p.word);
      p.word = null;
    }

    board[i][j] = '#';
    if (i > 0) {
      dfs(board, i - 1, j, p, res);
    }
    if (j > 0) {
      dfs(board, i, j - 1, p, res);
    }
    if (i < board.length - 1) {
      dfs(board, i + 1, j, p, res);
    }
    if (j < board[0].length - 1) {
      dfs(board, i, j + 1, p, res);
    }
    board[i][j] = c;
  }

  private Trie buildTrie(String[] words) {
    Trie root = new Trie();
    for (String w: words) {
      Trie p = root;
      for (char c: w.toCharArray()) {
        int i = c - 'a';
        if (p.next[i] == null) {
          p.next[i] = new Trie();
        }
        p = p.next[i];
      }
      p.word = w;
    }

    return root;
  }
}
