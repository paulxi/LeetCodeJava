package com.leetcode.algorithm.hard.shortestpathinagridwithobstacles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(6, solution.shortestPath(new int[][]{{0, 0, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}}, 1));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(-1, solution.shortestPath(new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 0, 0}}, 1));
    }
}
