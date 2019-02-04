package com.leetcode.algorithm.medium.solvetheequation;

class Solution {
  public String solveEquation(String equation) {
    String[] exps = equation.split("=");
    int[] res = eval(exps[0]);
    int[] res2 = eval(exps[1]);

    res[0] -= res2[0];
    res[1] = res2[1] - res[1];

    if (res[0] == 0 && res[1] == 0) {
      return "Infinite solutions";
    } else if (res[0] == 0) {
      return "No solution";
    } else {
      return "x=" + (res[1] / res[0]);
    }
  }

  private int[] eval(String exp) {
    String[] tokens = exp.split("(?=[-+])");
    int[] res = new int[2];

    for (String token: tokens) {
      if (token.equals("+x") || token.equals("x")) {
        res[0] += 1;
      } else if (token.equals("-x")) {
        res[0] -= 1;
      } else if (token.charAt(token.length() - 1) == 'x') {
        res[0] += Integer.parseInt(token.substring(0, token.length() - 1));
      } else {
        res[1] += Integer.parseInt(token);
      }
    }

    return res;
  }
}
