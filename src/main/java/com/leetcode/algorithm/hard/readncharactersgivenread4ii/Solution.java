package com.leetcode.algorithm.hard.readncharactersgivenread4ii;

import com.leetcode.algorithm.common.Reader4;

public class Solution extends Reader4 {
  private int i4 = 0;
  private int n4 = 0;
  private char[] buf4 = new char[4];

  /**
   * @param buf Destination buffer
   * @param n   Maximum number of characters to read
   * @return    The number of characters read
   */
  public int read(char[] buf, int n) {
    int i = 0;
    while (i < n) {
      if (i4 >= n4) {
        i4 = 0;
        n4 = read4(buf4);
        if (n4 == 0) {
          break;
        }
      }
      buf[i++] = buf4[i4++];
    }
    return i;
  }
}
