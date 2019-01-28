package com.leetcode.algorithm.medium.courseschedule;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    int[][] matrix = new int[numCourses][numCourses];
    int[] indegree = new int[numCourses];

    for (int i = 0; i < prerequisites.length; i++) {
      int ready = prerequisites[i][0];
      int pre = prerequisites[i][1];

      if (matrix[pre][ready] == 0) {
        indegree[ready]++;
      }
      matrix[pre][ready] = 1;
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < indegree.length; i++) {
      if (indegree[i] == 0) {
        queue.offer(i);
      }
    }

    int count = 0;
    while (!queue.isEmpty()) {
      int course = queue.poll();
      count++;
      for (int i = 0; i < numCourses; i++) {
        if (matrix[course][i] != 0) {
          indegree[i]--;
          if (indegree[i] == 0) {
            queue.offer(i);
          }
        }
      }
    }

    return count == numCourses;
  }
}
