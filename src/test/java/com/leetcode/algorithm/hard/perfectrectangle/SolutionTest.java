package com.leetcode.algorithm.hard.perfectrectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertTrue(solution.isRectangleCover(new int[][]{{1, 1, 3, 3},
                {3, 1, 4, 2},
                {3, 2, 4, 4},
                {1, 3, 2, 4},
                {2, 3, 3, 4}}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertFalse(solution.isRectangleCover(new int[][]{{1, 1, 2, 3},
                {1, 3, 2, 4},
                {3, 1, 4, 2},
                {3, 2, 4, 4}}));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertFalse(solution.isRectangleCover(new int[][]{{1, 1, 3, 3},
                {3, 1, 4, 2},
                {1, 3, 2, 4},
                {2, 2, 4, 4}}));
    }

    @Test
    public void testCase4() {
        Solution solution = new Solution();
        assertFalse(solution.isRectangleCover(new int[][]{{1, 1, 3, 3},
                {3, 1, 4, 2},
                {1, 3, 2, 4},
                {3, 2, 4, 4}}));
    }
}
