package com.leetcode.algorithm.hard.parallelcourses;

import java.util.*;

class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        int[] inDegree = new int[n + 1];
        for (int[] r : relations) {
            g.computeIfAbsent(r[0], l -> new ArrayList<>()).add(r[1]);
            ++inDegree[r[1]];
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }
        int semester = 0;
        while (!q.isEmpty()) {
            for (int sz = q.size(); sz > 0; sz--) {
                int c = q.poll();
                --n;
                if (!g.containsKey(c)) {
                    continue;
                }
                for (int course : g.remove(c)) {
                    if (--inDegree[course] == 0) {
                        q.offer(course);
                    }
                }
            }
            semester++;
        }
        return n == 0 ? semester : -1;
    }
}
