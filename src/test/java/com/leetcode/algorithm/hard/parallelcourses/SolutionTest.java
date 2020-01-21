package com.leetcode.algorithm.hard.parallelcourses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(2, solution.minimumSemesters(3, new int[][]{{1, 3}, {2, 3}}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(-1, solution.minimumSemesters(3, new int[][]{{1, 2}, {2, 3}, {3, 1}}));
    }
}
