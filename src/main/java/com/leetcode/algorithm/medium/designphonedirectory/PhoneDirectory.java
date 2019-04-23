package com.leetcode.algorithm.medium.designphonedirectory;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class PhoneDirectory {
  private Set<Integer> used = new HashSet<>();
  private Queue<Integer> available = new LinkedList<>();
  private int max;

  /** Initialize your data structure here
   @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
  public PhoneDirectory(int maxNumbers) {
    max = maxNumbers;
    for (int i = 0; i < maxNumbers; i++) {
      available.offer(i);
    }
  }

  /** Provide a number which is not assigned to anyone.
   @return - Return an available number. Return -1 if none is available. */
  public int get() {
    Integer ret = available.poll();
    if (ret == null) {
      return -1;
    }

    used.add(ret);
    return ret;
  }

  /** Check if a number is available or not. */
  public boolean check(int number) {
    if (number > max || number < 0) {
      return false;
    }

    return !used.contains(number);
  }

  /** Recycle or release a number. */
  public void release(int number) {
    if (used.remove(number)) {
      available.offer(number);
    }
  }
}
