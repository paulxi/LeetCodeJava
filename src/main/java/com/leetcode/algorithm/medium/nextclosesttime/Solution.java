package com.leetcode.algorithm.medium.nextclosesttime;

import java.util.Arrays;

class Solution {
  public String nextClosestTime(String time) {
    int[] digits = new int[4];
    digits[0] = Integer.valueOf(time.substring(0, 1));
    digits[1] = Integer.valueOf(time.substring(1, 2));
    digits[2] = Integer.valueOf(time.substring(3, 4));
    digits[3] = Integer.valueOf(time.substring(4, 5));
    int timeValue = convertToNumber(digits);

    Arrays.sort(digits);

    int[] firstDigits = null;
    for (int i = 0; i < digits.length; i++) {
      for (int j = 0; j < digits.length; j++) {
        if (digits[i] * 10 + digits[j] <= 23) {
          for (int k = 0; k < digits.length; k++) {
            for (int l = 0; l < digits.length; l++) {
              if (digits[k] * 10 + digits[l] <= 59) {
                int[] nums = new int[] {digits[i], digits[j], digits[k], digits[l]};
                int value = convertToNumber(nums);
                if (firstDigits == null) {
                  firstDigits = nums;
                }

                if (value > timeValue) {
                  return String.format("%d%d:%d%d", nums[0], nums[1], nums[2], nums[3]);
                }
              }
            }
          }
        }

      }
    }

    return String.format("%d%d:%d%d", firstDigits[0], firstDigits[1], firstDigits[2], firstDigits[3]);
  }

  private int convertToNumber(int[] digits) {
    return (digits[0] * 10 + digits[1]) * 60 + (digits[2] * 10 + digits[3]);
  }
}
