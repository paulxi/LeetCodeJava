package com.leetcode.algorithm.medium.countserversthatcommunicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(0, solution.countServers(new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(3, solution.countServers(new int[][]{{1, 0}, {1, 1}}));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals(4, solution.countServers(new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
    }
}
