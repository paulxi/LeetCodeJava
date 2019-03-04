package com.leetcode.algorithm.hard.basiccalculatoriv;

import java.util.*;

class Solution {
  private static class Poly {
    private Map<List<String>, Integer> count;
    Poly() {
      count = new HashMap<>();
    }

    void update(List<String> key, int val) {
      this.count.put(key, this.count.getOrDefault(key, 0) + val);
    }

    Poly add(Poly that) {
      Poly ans = new Poly();
      for (List<String> key: this.count.keySet()) {
        ans.update(key, this.count.get(key));
      }
      for (List<String> key: that.count.keySet()) {
        ans.update(key, that.count.get(key));
      }
      return ans;
    }

    Poly sub(Poly that) {
      Poly ans = new Poly();
      for (List<String> key: this.count.keySet()) {
        ans.update(key, this.count.get(key));
      }
      for (List<String> key: that.count.keySet()) {
        ans.update(key, -1 * that.count.get(key));
      }
      return ans;
    }

    Poly mul(Poly that) {
      Poly ans = new Poly();
      for (List<String> k1: this.count.keySet()) {
        for (List<String> k2: that.count.keySet()) {
          List<String> kNew = new ArrayList<>();
          for (String x: k1) {
            kNew.add(x);
          }
          for (String x: k2) {
            kNew.add(x);
          }
          Collections.sort(kNew);
          ans.update(kNew, this.count.get(k1) * that.count.get(k2));
        }
      }
      return ans;
    }

    Poly evaluate(Map<String, Integer> evalMap) {
      Poly ans = new Poly();
      for (List<String> k: this.count.keySet()) {
        int c = this.count.get(k);
        List<String> free = new ArrayList<>();
        for (String token: k) {
          if (evalMap.containsKey(token)) {
            c *= evalMap.get(token);
          } else {
            free.add(token);
          }
        }
        ans.update(free, c);
      }
      return ans;
    }

    List<String> toList() {
      List<String> ans = new ArrayList<>();
      List<List<String>> keys = new ArrayList<>(this.count.keySet());
      Collections.sort(keys,
          (a, b) -> a.size() != b.size() ? b.size() - a.size() : compareList(a, b));

      for (List<String> key: keys) {
        int v = this.count.get(key);
        if (v == 0) {
          continue;
        }
        StringBuilder word = new StringBuilder();
        word.append(v);
        for (String token: key) {
          word.append("*");
          word.append(token);
        }
        ans.add(word.toString());
      }
      return ans;
    }


    private int compareList(List<String> a, List<String> b) {
     for (int i = 0; i < a.size(); i++) {
       String x = a.get(i);
       String y = b.get(i);
       if (x.compareTo(y) != 0) {
         return x.compareTo(y);
       }
     }

     return 0;
    }
  }

  public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
    Map<String, Integer> evalMap = new HashMap<>();
    for (int i = 0; i < evalvars.length; i++) {
      evalMap.put(evalvars[i], evalints[i]);
    }

    return parse(expression).evaluate(evalMap).toList();
  }

  private Poly parse(String expr) {
    List<Poly> bucket = new ArrayList<>();
    List<Character> symbols = new ArrayList<>();
    int i = 0;
    while (i < expr.length()) {
      if (expr.charAt(i) == '(') {
        int bal = 0;
        int j = i;
        for (; j < expr.length(); j++) {
          if (expr.charAt(j) == '(') {
            bal++;
          }
          if (expr.charAt(j) == ')') {
            bal--;
          }
          if (bal == 0) {
            break;
          }
        }
        bucket.add(parse(expr.substring(i + 1, j)));
        i = j;
      } else if (Character.isLetterOrDigit(expr.charAt(i))) {
        int j = i;
        boolean flag = false;
        for (; j < expr.length(); j++) {
          if (expr.charAt(j) == ' ') {
            flag = true;
            bucket.add(make(expr.substring(i, j)));
            break;
          }
        }
        if (!flag) {
          bucket.add(make(expr.substring(i, j)));
        }
        i = j;
      } else if (expr.charAt(i) != ' ') {
        symbols.add(expr.charAt(i));
      }
      i++;
    }

    for (int j = symbols.size() - 1; j >= 0; j--) {
      if (symbols.get(j) == '*') {
        bucket.set(j, combine(bucket.get(j), bucket.remove(j + 1), symbols.remove(j)));
      }
    }

    if (bucket.isEmpty()) {
      return new Poly();
    }

    Poly ans = bucket.get(0);
    for (int j = 0; j < symbols.size(); j++) {
      ans = combine(ans, bucket.get(j + 1), symbols.get(j));
    }

    return ans;
  }

  private Poly make(String expr) {
    Poly ans = new Poly();
    List<String> list = new ArrayList<>();

    if (Character.isDigit(expr.charAt(0))) {
      ans.update(list, Integer.valueOf(expr));
    } else {
      list.add(expr);
      ans.update(list, 1);
    }

    return ans;
  }

  private Poly combine(Poly left, Poly right, char symbol) {
    if (symbol == '+') {
      return left.add(right);
    }
    if (symbol == '-') {
      return left.sub(right);
    }
    if (symbol == '*') {
      return left.mul(right);
    }
    return null;
  }
}
