package com.leetcode.algorithm.easy.findwinneronatictactoegame;

class Solution {
    public String tictactoe(int[][] moves) {
        int[] aRow = new int[3];
        int[] aCol = new int[3];
        int[] bRow = new int[3];
        int[] bCol = new int[3];
        int aD1 = 0;
        int aD2 = 0;
        int bD1 = 0;
        int bD2 = 0;

        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            if (i % 2 == 1) {
                if (++bRow[r] == 3 || ++bCol[c] == 3 || (r == c && ++bD1 == 3) || (r + c == 2 && ++bD2 == 3)) {
                    return "B";
                }
            } else {
                if (++aRow[r] == 3 || ++aCol[c] == 3 || (r == c && ++aD1 == 3) || (r + c == 2 && ++aD2 == 3)) {
                    return "A";
                }
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
