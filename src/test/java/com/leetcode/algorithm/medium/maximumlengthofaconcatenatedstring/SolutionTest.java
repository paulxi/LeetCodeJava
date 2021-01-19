package com.leetcode.algorithm.medium.maximumlengthofaconcatenatedstring;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(4, solution.maxLength(List.of("un", "iq", "ue")));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(6, solution.maxLength(List.of("cha", "r", "act", "ers")));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals(26, solution.maxLength(List.of("abcdefghijklmnopqrstuvwxyz")));
    }
}
