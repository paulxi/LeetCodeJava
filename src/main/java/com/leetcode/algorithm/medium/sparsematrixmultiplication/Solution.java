package com.leetcode.algorithm.medium.sparsematrixmultiplication;

class Solution {
  public int[][] multiply(int[][] matrixA, int[][] matrixB) {
    int[][] result = new int[matrixA.length][matrixB[0].length];

    for (int i = 0; i < result.length; i++) {
      for (int k = 0; k < matrixA[0].length; k++) {
        if (matrixA[i][k] != 0) {
          for (int j = 0; j < result[0].length; j++) {
            if (matrixB[k][j] != 0) {
              result[i][j] += matrixA[i][k] * matrixB[k][j];
            }
          }
        }
      }
    }

    return result;
  }
}
