package com.leetcode.algorithm.hard.shortestpathinagridwithobstacles;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int shortestPath(int[][] grid, int k) {
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[m][n][k + 1];
        queue.offer(new int[]{0, 0, 0});
        visited[0][0][0] = true;
        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int row = cur[0];
                int col = cur[1];
                int curK = cur[2];
                if (row == m - 1 && col == n - 1) {
                    return res;
                }

                for (int[] dir : dirs) {
                    int nextR = dir[0] + row;
                    int nextC = dir[1] + col;
                    int nextK = curK;
                    if (nextR >= 0 && nextR < m && nextC >= 0 && nextC < n) {
                        if (grid[nextR][nextC] == 1) {
                            nextK++;
                        }
                        if (nextK <= k && !visited[nextR][nextC][nextK]) {
                            visited[nextR][nextC][nextK] = true;
                            queue.offer(new int[]{nextR, nextC, nextK});
                        }
                    }
                }
            }
            res++;
        }

        return -1;
    }
}
