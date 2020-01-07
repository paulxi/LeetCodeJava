package com.leetcode.algorithm.hard.sortitemsbygroupsrespectingdependencies;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{6, 3, 4, 5, 2, 0, 7, 1}, solution.sortItems(8, 2, new int[]{-1, -1, 1, 0, 0, 1, 0, -1}, Arrays.asList(
                Arrays.asList(),
                Arrays.asList(6),
                Arrays.asList(5),
                Arrays.asList(6),
                Arrays.asList(3, 6),
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList()
        )));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{}, solution.sortItems(8, 2, new int[]{-1, -1, 1, 0, 0, 1, 0, -1}, Arrays.asList(
                Arrays.asList(),
                Arrays.asList(6),
                Arrays.asList(5),
                Arrays.asList(6),
                Arrays.asList(3, 6),
                Arrays.asList(),
                Arrays.asList(4),
                Arrays.asList()
        )));
    }
}
