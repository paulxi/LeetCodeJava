package com.leetcode.algorithm.hard.braceexpansionii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Solution {
  public List<String> braceExpansionII(String expression) {
    String s = expression;
    boolean isUnion = true;
    Stack<List<String>> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '{') {
        int j = i;
        int p = 1;
        while (s.charAt(j) != '}' || p != 0) {
          j++;
          if (s.charAt(j) == '{') {
            p++;
          }
          if (s.charAt(j) == '}') {
            p--;
          }
        }
        List<String> slist = braceExpansionII(s.substring(i + 1, j));
        if (isUnion) {
          stack.push(slist);
        } else {
          stack.push(merge(stack.pop(), slist));
        }
        i = j;
        isUnion = false;
      } else if (Character.isLetter(c)) {
        List<String> slist = new ArrayList<>();
        slist.add("" + c);
        if (isUnion) {
          stack.push(slist);
        } else {
          stack.push(merge(stack.pop(), slist));
        }
        isUnion = false;
      } else if (c == ',') {
        isUnion = true;
      }
    }

    List<String> res = new ArrayList<>();
    while (!stack.isEmpty()) {
      for (String str: stack.pop()) {
        if (!res.contains(str)) {
          res.add(str);
        }
      }
    }
    Collections.sort(res);
    return res;
  }

  private List<String> merge(List<String> l1, List<String> l2) {
    List<String> res = new ArrayList<>();
    for (String s1: l1) {
      for (String s2: l2) {
        res.add(s1 + s2);
      }
    }
    return res;
  }
}
