package com.leetcode.algorithm.medium.maximumsidelengthofasquarewithsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals(2, solution.maxSideLength(new int[][]{{1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}
        }, 4));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals(0, solution.maxSideLength(new int[][]{{2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}
        }, 1));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals(3, solution.maxSideLength(new int[][]{{1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}
        }, 6));
    }

    @Test
    public void testCase4() {
        Solution solution = new Solution();
        assertEquals(2, solution.maxSideLength(new int[][]{{18, 70}, {61, 1}, {25, 85}, {14, 40}, {11, 96}, {97, 96}, {63, 45}
        }, 40184));
    }
}
