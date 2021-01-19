package com.leetcode.algorithm.hard.shortestpathtogetallkeys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(8, solution.shortestPathAllKeys(new String[] {"@.a.#", "###.#", "b.A.B"}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(6, solution.shortestPathAllKeys(new String[] {"@..aA","..B#.","....b"}));
    }
}
