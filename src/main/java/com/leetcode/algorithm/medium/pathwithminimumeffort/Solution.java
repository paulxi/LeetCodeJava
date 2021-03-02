package com.leetcode.algorithm.medium.pathwithminimumeffort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int[][] dirs = new int[][] {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int m = heights.length;
        int n = heights[0].length;
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.offer(new int[] {0, 0, 0});
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int r = top[0];
            int c = top[1];
            int d = top[2];
            if (d > dist[r][c]) {
                continue;
            }
            if (r == m -1 && c == n -1) {
                return d;
            }

            for (int[] dir: dirs) {
                int nextR = r + dir[0];
                int nextC = c + dir[1];
                if (nextR >= 0 && nextR < m && nextC >= 0 && nextC < n) {
                    int max = Math.max(d, Math.abs(heights[nextR][nextC] - heights[r][c]));
                    if (dist[nextR][nextC] > max) {
                        dist[nextR][nextC] = max;
                        pq.offer(new int[] {nextR, nextC, max});
                    }
                }
            }
        }
        return 0;
    }
}
