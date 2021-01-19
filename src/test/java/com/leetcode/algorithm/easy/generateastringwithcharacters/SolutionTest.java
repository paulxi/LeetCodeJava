package com.leetcode.algorithm.easy.generateastringwithcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals("aaab", solution.generateTheString(4));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals("ab", solution.generateTheString(2));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals("aaaaaaa", solution.generateTheString(7));
    }
}
