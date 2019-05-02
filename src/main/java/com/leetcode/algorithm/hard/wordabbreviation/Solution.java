package com.leetcode.algorithm.hard.wordabbreviation;

import java.util.*;

class Solution {
  private final static class Trie {
    int cnt = 0;
    Map<Character, Trie> next = new HashMap<>();
  }

  public List<String> wordsAbbreviation(List<String> dict) {
    Map<String, List<Integer>> abbrMap = new HashMap<>();
    String[] res = new String[dict.size()];

    for (int i = 0; i < dict.size(); i++) {
      String word = dict.get(i);
      String st = getShortestAbbr(word);
      if (!abbrMap.containsKey(st)) {
        abbrMap.put(st, new ArrayList<>());
      }
      abbrMap.get(st).add(i);
    }

    for (Map.Entry<String, List<Integer>> entry: abbrMap.entrySet()) {
      String abbr = entry.getKey();
      List<Integer> pos = entry.getValue();
      resolve(dict, res, abbr, pos);
    }

    return Arrays.asList(res);
  }

  private void resolve(List<String> dict, String[] res, String abbr, List<Integer> pos) {
    if (pos.size() == 1) {
      res[pos.get(0)] = abbr;
    } else {
      Trie trie = buildTrie(dict, pos);
      for (int p: pos) {
        String word = dict.get(p);
        Trie cur = trie;
        int i = 0;
        int n = word.length();
        while (i < n && cur.next.get(word.charAt(i)).cnt > 1) {
          cur = cur.next.get(word.charAt(i));
          i++;
        }

        if (i >= n - 3) {
          res[p] = word;
        } else {
          String pre = word.substring(0, i + 1);
          String st = pre + (n - i - 2) + "" + word.charAt(n - 1);
          res[p] = st;
        }
      }
    }
  }

  private Trie buildTrie(List<String> dict, List<Integer> pos) {
    Trie root = new Trie();
    for (int p: pos) {
      String word = dict.get(p);
      Trie cur = root;
      for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);
        if (cur.next.containsKey(c)) {
          cur = cur.next.get(c);
        } else {
          Trie next = new Trie();
          cur.next.put(c, next);
          cur = next;
        }
        cur.cnt++;
      }
    }

    return root;
  }


  private String getShortestAbbr(String s) {
    if (s.length() <= 3) {
      return s;
    } else {
      return s.charAt(0) + "" + (s.length() - 2) + "" + s.charAt(s.length() - 1);
    }
  }
}
