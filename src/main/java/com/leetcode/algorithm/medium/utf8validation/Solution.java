package com.leetcode.algorithm.medium.utf8validation;

class Solution {
  public boolean validUtf8(int[] data) {
    int i = 0;
    while (i < data.length) {
      int value = data[i];
      if (value >= 0b11110000 && value <= 0b11110111) {
        if (i + 3 < data.length) {
          if (!checkPrefix(new int[] {data[i + 1], data[i + 2], data[i + 3]})) {
            return false;
          }
        } else {
          return false;
        }
        i += 3;
      } else if (value >= 0b11100000 && value <= 0b11101111) {
        if (i + 2 < data.length) {
          if (!checkPrefix(new int[] {data[i + 1], data[i + 2]})) {
            return false;
          }
        } else {
          return false;
        }
        i += 2;
      } else if (value >= 0b11000000 && value <= 0b11011111) {
        if (i + 1 < data.length) {
          if (!checkPrefix(new int[] {data[i + 1]})) {
            return false;
          }
        } else {
          return false;
        }
        i += 1;
      } else if (!(value >= 0b00000000 && value <= 0b01111111)) {
        return false;
      }
      i++;
    }

    return true;
  }

  private boolean checkPrefix(int[] data) {
    for (int value : data) {
      if (!(value >= 0b10000000 && value <= 0b10111111)) {
        return false;
      }
    }

    return true;
  }
}
