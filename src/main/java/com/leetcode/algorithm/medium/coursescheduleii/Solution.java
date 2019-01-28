package com.leetcode.algorithm.medium.coursescheduleii;

import java.util.*;

class Solution {
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    if (numCourses == 0) {
      return null;
    }

    int[] indegree = new int[numCourses];
    int[] order = new int[numCourses];
    int index = 0;

    for (int i = 0; i < prerequisites.length; i++) {
      indegree[prerequisites[i][0]]++;
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
      if (indegree[i] == 0) {
        queue.offer(i);
        order[index++] = i;
      }
    }

    while (!queue.isEmpty()) {
      int pre =  queue.poll();
      for (int i = 0; i < prerequisites.length; i++) {
        if (prerequisites[i][1] == pre) {
          indegree[prerequisites[i][0]]--;

          if (indegree[prerequisites[i][0]] == 0) {
            order[index++] = prerequisites[i][0];
            queue.offer(prerequisites[i][0]);
          }
        }
      }
    }

    return index == numCourses ? order : new int[0];
  }
}
