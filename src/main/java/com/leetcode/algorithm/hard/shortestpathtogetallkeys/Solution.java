package com.leetcode.algorithm.hard.shortestpathtogetallkeys;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    private static class State {
        int keys, i, j;
        State(int keys, int i, int j) {
            this.keys = keys;
            this.i = i;
            this.j = j;
        }
    }
    public int shortestPathAllKeys(String[] grid) {
        int m = grid.length;
        int n = grid[0].length();
        int x = -1, y = -1;
        int max = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '@') {
                    x = i;
                    y = j;
                }
                if (c >= 'a' && c <= 'f') {
                    max = Math.max(c - 'a' + 1, max);
                }
            }
        }
        State start = new State(0, x, y);
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        visited.add(0 + " " + x + " " + y);
        queue.offer(start);
        int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                State cur = queue.poll();
                if (cur.keys == (1 << max) - 1) {
                    return step;
                }
                for (int[] dir: dirs) {
                    int nextX = cur.i + dir[0];
                    int nextY = cur.j + dir[1];
                    int keys = cur.keys;
                    if (nextX >=0 && nextX < m && nextY >= 0 && nextY < n) {
                        char c = grid[nextX].charAt(nextY);
                        if (c == '#') {
                            continue;
                        }
                        if (c >= 'a' && c <= 'f') {
                            keys |= 1 << (c - 'a');
                        }
                        if (c >= 'A' && c <= 'F' && ((keys >> (c - 'A')) & 1) == 0) {
                            continue;
                        }
                        if (!visited.contains(keys + " " + nextX + " " + nextY)) {
                            visited.add(keys + " " + nextX + " " + nextY);
                            queue.offer(new State(keys, nextX, nextY));
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
