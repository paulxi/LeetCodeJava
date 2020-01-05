package com.leetcode.algorithm.hard.setintersectionsizeatleasttwo;

import java.util.Arrays;

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(b[0], a[0]));

        int m = 0;
        int largest = -1;
        int second = -1;

        for (int[] interval: intervals) {
            int a = interval[0];
            int b = interval[1];

            boolean is_largest_in = a <= largest;
            boolean is_second_in = a <= second;

            if (is_largest_in && is_second_in) {
                continue;
            }
            m += is_largest_in ? 1 : 2;
            second = is_largest_in ? largest : b - 1;
            largest = b;
        }
        return m;
    }
}
