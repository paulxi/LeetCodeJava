package com.leetcode.algorithm.medium.designhitcounter;

class HitCounter {
  private int[] times = new int[300];
  private int[] hits = new int[300];

  /** Initialize your data structure here. */
  public HitCounter() {

  }

  /** Record a hit.
   @param timestamp - The current timestamp (in seconds granularity). */
  public void hit(int timestamp) {
    int index = timestamp % 300;
    if (times[index] == timestamp) {
      hits[index]++;
    } else {
      times[index] = timestamp;
      hits[index] = 1;
    }
  }

  /** Return the number of hits in the past 5 minutes.
   @param timestamp - The current timestamp (in seconds granularity). */
  public int getHits(int timestamp) {
    int total = 0;
    for (int i = 0; i < 300; i++) {
      if (timestamp - times[i] < 300) {
        total += hits[i];
      }
    }
    return total;
  }
}
