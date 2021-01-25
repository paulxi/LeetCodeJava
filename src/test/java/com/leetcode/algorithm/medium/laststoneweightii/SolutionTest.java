package com.leetcode.algorithm.medium.laststoneweightii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(1, solution.lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
