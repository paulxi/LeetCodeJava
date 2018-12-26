package com.leetcode.algorithm.hard.minimumcosttohirekworkers;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
  private static final class Worker implements Comparable<Worker> {
    int quality;
    int wage;

    public Worker(int q, int w) {
      quality = q;
      wage = w;
    }

    public double ratio() {
      return (double) wage / quality;
    }

    public int compareTo(Worker other) {
      return Double.compare(ratio(), other.ratio());
    }
  }

  public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
    int n = quality.length;
    Worker[] workers = new Worker[n];
    for (int i = 0; i < n; i++) {
      workers[i] = new Worker(quality[i], wage[i]);
    }
    Arrays.sort(workers);

    double ans = 1e9;
    int sumq = 0;
    PriorityQueue<Integer> pool = new PriorityQueue<>();
    for (Worker worker : workers) {
      pool.offer(-worker.quality);
      sumq += worker.quality;
      if (pool.size() > k) {
        sumq += pool.poll();
      }
      if (pool.size() == k) {
        ans = Math.min(ans, sumq * worker.ratio());
      }
    }

    return ans;
  }
}
