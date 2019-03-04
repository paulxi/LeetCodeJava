package com.leetcode.algorithm.hard.palindromepairs;

import java.util.*;

class Solution {
  private static class Trie {
    Trie[] next;
    int index;
    List<Integer> list;

    Trie() {
      next = new Trie[26];
      index = -1;
      list = new ArrayList<>();
    }
  }


  private boolean isPalindrome(String str, int i, int j) {
    char[] arr = str.toCharArray();
    while (i < j) {
      if (arr[i] != arr[j]) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public List<List<Integer>> palindromePairs(String[] words) {
    List<List<Integer>> ans = new ArrayList<>();
    Trie root = new Trie();
    for (int i = 0; i < words.length; i++) {
      addWord(root, words[i], i);
    }

    for (int i = 0; i < words.length; i++) {
      search(words, i, root, ans);
    }


    return ans;
  }

  private void addWord(Trie t, String word, int index) {
    Trie curr = t;
    for (int i = word.length() - 1; i >= 0; i--) {
      int j = word.charAt(i) - 'a';
      if (curr.next[j] == null) {
        curr.next[j] = new Trie();
      }

      if (isPalindrome(word, 0, i)) {
        curr.list.add(index);
      }
      curr = curr.next[j];
    }

    curr.list.add(index);
    curr.index = index;
  }

  private void search(String[] words, int i, Trie t, List<List<Integer>> ans) {
    Trie curr = t;
    for (int j = 0; j < words[i].length(); j++) {
      if (curr.index >= 0 && curr.index != i && isPalindrome(words[i], j, words[i].length() - 1)) {
        ans.add(Arrays.asList(i, curr.index));
      }
      curr = curr.next[words[i].charAt(j) - 'a'];
      if (curr == null) {
        return;
      }
    }

    for (int j : curr.list) {
      if (i == j) {
        continue;
      }
      ans.add(Arrays.asList(i, j));
    }
  }
}
