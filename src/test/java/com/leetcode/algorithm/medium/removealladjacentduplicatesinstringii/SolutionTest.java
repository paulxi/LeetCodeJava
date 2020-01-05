package com.leetcode.algorithm.medium.removealladjacentduplicatesinstringii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals("abcd", solution.removeDuplicates("abcd", 2));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals("aa", solution.removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals("ps", solution.removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
