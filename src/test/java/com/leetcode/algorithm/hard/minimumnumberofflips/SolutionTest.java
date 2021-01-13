package com.leetcode.algorithm.hard.minimumnumberofflips;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(3, solution.minFlips(new int[][] {{0, 0}, {0, 1}}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(0, solution.minFlips(new int[][] {{0}}));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals(6, solution.minFlips(new int[][] {{1, 1, 1}, {1, 0, 1}, {0, 0, 0}}));
    }

    @Test
    public void testCase4() {
        Solution solution = new Solution();
        assertEquals(-1, solution.minFlips(new int[][] {{1, 0, 0}, {1, 0, 0}}));
    }
}
