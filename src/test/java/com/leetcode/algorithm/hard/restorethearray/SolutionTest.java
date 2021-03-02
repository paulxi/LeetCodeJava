package com.leetcode.algorithm.hard.restorethearray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(1, solution.numberOfArrays("1000", 10000));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(0, solution.numberOfArrays("1000", 10));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals(8, solution.numberOfArrays("1317", 2000));
    }

    @Test
    public void testCase4() {
        Solution solution = new Solution();
        assertEquals(1, solution.numberOfArrays("2020", 30));
    }

    @Test
    public void testCase5() {
        Solution solution = new Solution();
        assertEquals(34, solution.numberOfArrays("1234567890", 90));
    }
}
