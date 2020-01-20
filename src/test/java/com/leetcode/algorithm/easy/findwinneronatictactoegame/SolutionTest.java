package com.leetcode.algorithm.easy.findwinneronatictactoegame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution solution = new Solution();
        assertEquals("A", solution.tictactoe(new int[][] {{0,0},{2,0},{1,1},{2,1},{2,2}}));
    }

    @Test
    public void testCase2() {
        Solution solution = new Solution();
        assertEquals("B", solution.tictactoe(new int[][] {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}}));
    }

    @Test
    public void testCase3() {
        Solution solution = new Solution();
        assertEquals("Draw", solution.tictactoe(new int[][] {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}}));
    }

    @Test
    public void testCase4() {
        Solution solution = new Solution();
        assertEquals("Pending", solution.tictactoe(new int[][] {{0,0},{1,1}}));
    }
}
