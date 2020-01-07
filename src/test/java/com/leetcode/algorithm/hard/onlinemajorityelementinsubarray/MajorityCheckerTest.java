package com.leetcode.algorithm.hard.onlinemajorityelementinsubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MajorityCheckerTest {
    @Test
    public void testCase1() {
        MajorityChecker majorityChecker = new MajorityChecker(new int[]{1, 1, 2, 2, 1, 1});

        assertEquals(1, majorityChecker.query(0, 5, 4)); // return 1
        assertEquals(-1, majorityChecker.query(0, 3, 3)); // return -1
        assertEquals(2, majorityChecker.query(2, 3, 2)); // return 2
    }
}
