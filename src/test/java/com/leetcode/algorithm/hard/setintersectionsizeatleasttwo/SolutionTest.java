package com.leetcode.algorithm.hard.setintersectionsizeatleasttwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(
                3,
                solution.intersectionSizeTwo(new int[][]{{1, 3}, {1, 4}, {2, 5}, {3, 5}}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(
                5,
                solution.intersectionSizeTwo(new int[][]{{1, 2}, {2, 3}, {2, 4}, {4, 5}}));
    }
}
