package com.leetcode.algorithm.medium.dividearrayinsetsofk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertTrue(solution.isPossibleDivide(new int[]{1, 2, 3, 3, 4, 4, 5, 6}, 4));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertTrue(solution.isPossibleDivide(new int[]{3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11}, 3));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertTrue(solution.isPossibleDivide(new int[]{3, 3, 2, 2, 1, 1}, 3));
    }

    @Test
    public void testCase4() {
        Solution solution = new Solution();
        assertFalse(solution.isPossibleDivide(new int[]{1, 2, 3, 4}, 3));
    }
}
