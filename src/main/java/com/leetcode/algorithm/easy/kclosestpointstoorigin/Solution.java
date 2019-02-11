package com.leetcode.algorithm.easy.kclosestpointstoorigin;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class Solution {
//  public int[][] kClosest(int[][] points, int k) {
//    if (k == 0) {
//      return new int[][] {};
//    }
//
//    if (points.length <= k) {
//      return points;
//    }
//
//    Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
//
//    int[][] ans = new int[k][2];
//
//    for (int i = 0; i < k; i++) {
//      ans[i] = points[i];
//    }
//
//    return ans;
//  }

  int[][] points;

  public int[][] kClosest(int[][] points, int k) {
    this.points = points;
    if (k == 0) {
      return new int[][] {};
    }

    if (points.length <= k) {
      return points;
    }

    helper(0, points.length - 1, k);
    return Arrays.copyOfRange(points, 0, k);
  }

  private void helper(int i, int j, int k) {
    if (i >= j) {
      return;
    }
    int start = i;
    int end = j;

    int pivot = dist(ThreadLocalRandom.current().nextInt(i, j));

    while (i < j) {
      while (i < j && dist(i) < pivot) {
        i++;
      }
      while (i < j && dist(j) > pivot) {
        j--;
      }
      swap(i, j);
    }

    if (k <= i - start + 1) {
      helper(start, i, k);
    } else {
      helper(i + 1, end, k - (i - start + 1));
    }
  }

  private int dist(int i) {
    return points[i][0] * points[i][0] + points[i][1] * points[i][1];
  }

  private void swap(int i, int j) {
    int p0 = points[i][0];
    int p1 = points[i][1];

    points[i][0] = points[j][0];
    points[i][1] = points[j][1];
    points[j][0] = p0;
    points[j][1] = p1;
  }
}
