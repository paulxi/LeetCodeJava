package com.leetcode.algorithm.hard.reachingpoints;

class Solution {
  public boolean reachingPoints(int sx, int sy, int tx, int ty) {
    while (sx <= tx && sy <= ty) {
      if (tx == ty) {
        break;
      }

      if (tx > ty) {
        if (ty > sy) {
          tx = tx % ty;
        } else {
          return (tx - sx) % ty == 0;
        }
      } else {
        if (tx > sx) {
          ty = ty % tx;
        } else {
          return (ty - sy) % tx == 0;
        }
      }
    }

    return (tx == sx && ty == sy);
  }
}
