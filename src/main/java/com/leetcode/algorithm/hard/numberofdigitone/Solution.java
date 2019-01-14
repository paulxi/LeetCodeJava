package com.leetcode.algorithm.hard.numberofdigitone;

class Solution {
//  public int countDigitOne(int n) {
//    int count = 0;
//
//    for (long k = 1; k <= n; k *= 10) {
//      long r = n / k, m = n % k;
//      // sum up the count of ones on every place k
//      count += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
//    }
//
//    return count;
//  }

  public int countDigitOne(int n) {
    if (n <= 0) {
      return 0;
    }

    int q = n, x = 1, ans = 0;
    do {
      int digit = q % 10;
      q /= 10;
      ans += q * x;
      if (digit == 1) {
        ans += n % x + 1;
      }
      if (digit > 1) {
        ans += x;
      }
      x *= 10;
    } while (q > 0);

    return ans;
  }
}
