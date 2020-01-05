package com.leetcode.algorithm.easy.largesttimeforgivendigits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals("23:41", solution.largestTimeFromDigits(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals("", solution.largestTimeFromDigits(new int[]{5, 5, 5, 5}));
    }
}
