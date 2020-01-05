package com.leetcode.algorithm.easy.largesttimeforgivendigits;

class Solution {
    public String largestTimeFromDigits(int[] nums) {
        String ans = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (i == j || i == k || j == k) {
                        continue;
                    }
                    String h = "" + nums[i] + nums[j];
                    String m = "" + nums[k] + nums[6 - i - j - k];
                    String t = h + ":" + m;
                    if (h.compareTo("24") < 0 && m.compareTo("60") < 0 && ans.compareTo(t) < 0) {
                        ans = t;
                    }
                }
            }
        }
        return ans;
    }
}
