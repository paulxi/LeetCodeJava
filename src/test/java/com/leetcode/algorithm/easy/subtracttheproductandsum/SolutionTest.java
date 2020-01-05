package com.leetcode.algorithm.easy.subtracttheproductandsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(15, solution.subtractProductAndSum(234));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(21, solution.subtractProductAndSum(4421));
    }
}
