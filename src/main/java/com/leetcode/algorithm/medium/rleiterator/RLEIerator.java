package com.leetcode.algorithm.medium.rleiterator;

class RLEIterator {

  int[] arr;
  int index;

  public RLEIterator(int[] arr) {
    this.arr = arr;
    index = 0;
  }

  public int next(int n) {
    while (index < arr.length && n > arr[index]) {
      n -= arr[index];
      index += 2;
    }

    if (index < arr.length) {
      arr[index] -= n;
      return arr[index + 1];
    }

    return -1;
  }
}
