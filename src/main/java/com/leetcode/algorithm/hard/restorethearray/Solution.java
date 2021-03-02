package com.leetcode.algorithm.hard.restorethearray;

class Solution {
    public int numberOfArrays(String s, int k) {
        Integer[] dp = new Integer[s.length()];
        return dfs(s, k, 0, dp);
    }

    private int dfs(String s, int k, int i, Integer[] dp) {
        if (i == s.length()) {
            return 1;
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (dp[i] != null) {
            return dp[i];
        }
        int ans = 0;
        long num = 0;
        for (int j = i; j < s.length(); j++) {
            num = num * 10 + s.charAt(j) - '0';
            if (num > k) {
                break;
            }
            ans += dfs(s, k, j + 1, dp);
            ans %= 1000000007;
        }
        dp[i] = ans;
        return ans;
    }
}
