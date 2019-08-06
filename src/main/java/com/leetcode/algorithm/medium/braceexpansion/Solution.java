package com.leetcode.algorithm.medium.braceexpansion;

import java.util.*;

class Solution {
  public String[] expand(String str) {
    char[] charArr = str.toCharArray();
    Queue<Character> queue = new LinkedList<>();
    for (char c : charArr) {
      queue.offer(c);
    }
    List<String> res = helper(queue);
    Collections.sort(res);
    return res.toArray(new String[res.size()]);
  }

  private List<String> helper(Queue<Character> queue) {
    List<String> res = new ArrayList<>();
    res.add("");
    boolean inBrace = false;
    while (!queue.isEmpty()) {
      char c = queue.poll();
      if (c == '{') {
        List<String> list = helper(queue);
        List<String> newList = new ArrayList<>();
        for (String s : res) {
          for (String l : list) {
            newList.add(s + l);
          }
        }
        res = newList;
      } else if (c == '}') {
        break;
      } else if (c == ',') {
        inBrace = true;
      } else {
        if (inBrace) {
          res.add("" + c);
        } else {
          for (int i = 0; i < res.size(); i++) {
            res.set(i, res.get(i) + c);
          }
        }
      }
    }

    return res;
  }
}
