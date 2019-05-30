package com.leetcode.algorithm.hard.numberofatoms;

import java.util.Map;
import java.util.TreeMap;

class Solution {
  int i;
  public String countOfAtoms(String formula) {
    StringBuilder sb = new StringBuilder();
    i = 0;
    Map<String, Integer> count = parse(formula);
    for (String name : count.keySet()) {
      sb.append(name);
      int multi = count.get(name);
      if (multi > 1) {
        sb.append(multi);
      }
    }

    return sb.toString();
  }

  private Map<String, Integer> parse(String formula) {
    int n = formula.length();
    Map<String, Integer> count = new TreeMap();
    while (i < formula.length() && formula.charAt(i) != ')') {
      if (formula.charAt(i) == '(') {
        i++;
        for (Map.Entry<String, Integer> entry: parse(formula).entrySet()) {
          count.put(entry.getKey(), count.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
      } else {
        int iStart = i;
        i++;
        while (i < n && Character.isLowerCase(formula.charAt(i))) {
          i++;
        }
        String name = formula.substring(iStart, i);
        iStart = i;
        while (i < n && Character.isDigit(formula.charAt(i))) {
          i++;
        }
        int multi = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
        count.put(name, count.getOrDefault(name, 0) + multi);
      }
    }

    i++;
    int iStart = i;
    while (i < n && Character.isDigit(formula.charAt(i))) {
      i++;
    }
    if (iStart < i) {
      int multi = Integer.parseInt(formula.substring(iStart, i));
      for (String key: count.keySet()) {
        count.put(key, count.get(key) * multi);
      }
    }

    return count;
  }
}
