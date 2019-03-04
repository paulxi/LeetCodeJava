package com.leetcode.algorithm.hard.wordsquares;

import java.util.ArrayList;
import java.util.List;

class Solution {
  private static class Trie {
    String word;
    Trie[] next;

    Trie() {
      next = new Trie[26];
    }
  }

  public List<List<String>> wordSquares(String[] words) {
    Trie root = new Trie();

    for (String word: words) {
      Trie curr = root;

      for (char c: word.toCharArray()) {
        int index = c - 'a';
        if (curr.next[index] == null) {
          curr.next[index] = new Trie();
        }

        curr = curr.next[index];
      }

      curr.word = word;
    }


    List<List<String>> ans = new ArrayList<>();
    List<String> result = new ArrayList<>();
    for (String w: words) {
      result.add(w);
      helper(w.length(), root, ans, result);
      result.remove(result.size() - 1);
    }

    return ans;
  }

  private void helper(int len, Trie t, List<List<String>> ans, List<String> result) {
    if (result.size() == len) {
      ans.add(new ArrayList<>(result));
      return;
    }

    int idx = result.size();
    StringBuilder sb = new StringBuilder();
    for (String s: result) {
      sb.append(s.charAt(idx));
    }

    List<String> startWith = findByPrefix(t, sb.toString());
    for (String str: startWith) {
      result.add(str);
      helper(len, t, ans, result);
      result.remove(result.size() - 1);
    }
  }

  private List<String> findByPrefix(Trie t, String s) {
    Trie curr = t;
    for (char c: s.toCharArray()) {
      int index = c - 'a';
      if (curr.next[index] == null) {
        return new ArrayList<>();
      }
      curr = curr.next[index];
    }

    List<String> ans = new ArrayList<>();
    traverse(curr, ans);
    return ans;
  }

  private void traverse(Trie t, List<String> list) {
    if (t.word != null) {
      list.add(t.word);
    }

    Trie curr = t;
    for (int i = 0; i < curr.next.length; i++) {
      if (curr.next[i] != null) {
        traverse(curr.next[i], list);
      }
    }
  }
}
