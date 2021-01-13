package com.leetcode.algorithm.hard.minimumnumberofflips;

import java.util.*;

class Solution {
    public int minFlips(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Set<Integer> visited = new HashSet<>();
        Queue<Pair> queue = new LinkedList<>();
        int begin = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    begin += (1 << (i * n) + j);
                }
            }
        }
        if (begin == 0) {
            return 0;
        }

        visited.add(begin);
        queue.add(new Pair(begin, 0));
        int[][] dirs = { {0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (pair.num == 0) {
                return pair.cost;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = toggleBits(pair.num, i, j, m, n, dirs);
                    if (!visited.contains(temp)) {
                        visited.add(temp);
                        queue.offer(new Pair(temp, pair.cost + 1));
                    }
                }
            }
        }
        return -1;
    }

    private int toggleBits(int curr, int i, int j, int m, int n, int[][] dirs) {
        int mask = 1 << (i * n + j);
        int result = curr ^ mask;
        for (int[] dir: dirs) {
            int row = i + dir[0];
            int col = j + dir[1];

            if (row < 0 || col < 0 || row >= m || col >= n) {
                continue;
            }
            mask = 1 << (row * n + col);
            result ^= mask;
        }

        return result;
    }

    private class Pair {
        int num;
        int cost;

        Pair(int num, int cost) {
            this.num = num;
            this.cost = cost;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof Pair)) {
                return false;
            }

            Pair p = (Pair)o;
            return p.num == num && p.cost == cost;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num, cost);
        }
    }
}
