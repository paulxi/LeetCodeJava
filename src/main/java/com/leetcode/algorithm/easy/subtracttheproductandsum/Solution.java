package com.leetcode.algorithm.easy.subtracttheproductandsum;

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int production = 1;
        while (n > 0) {
            sum += n % 10;
            production *= n % 10;
            n /= 10;
        }
        return production - sum;
    }
}
