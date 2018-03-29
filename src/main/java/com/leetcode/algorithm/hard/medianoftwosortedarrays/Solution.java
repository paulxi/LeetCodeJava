package com.leetcode.algorithm.hard.medianoftwosortedarrays;

public class Solution {
  /**
   * There are two sorted arrays nums1 and nums2 of size m and n respectively.
   * Find the median of the two sorted arrays. The overall run time complexity
   * should be O(log (m+n)).
   *
   * @param nums1 an array of integer
   * @param nums2 an array of integer
   * @return the median value
   */
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
      int[] temp = nums1;
      nums1 = nums2;
      nums2 = temp;
    }

    int m = nums1.length;
    int n = nums2.length;

    int imin = 0;
    int imax = m;
    int halfLen = (m + n + 1) / 2;

    while (imin <= imax) {
      int i = (imin + imax) / 2;
      int j = halfLen - i;

      if (i < imax && nums2[j - 1] > nums1[i]) {
        imin = i + 1;
      } else if (i > imin && nums1[i - 1] > nums2[j]) {
        imax = i - 1;
      } else {
        int maxLeft = 0;
        if (i == 0) {
          if (j > 0) {
            maxLeft = nums2[j - 1];
          }
        } else if (j == 0) {
          maxLeft = nums1[i - 1];
        } else {
          maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
        }

        int minRight = 0;
        if (i == m) {
          if (j < n) {
            minRight = nums2[j];
          }
        } else if (j == n) {
          minRight = nums1[i];
        } else {
          minRight = Math.min(nums2[j], nums1[i]);
        }

        if ((m + n) % 2 == 1) {
          return maxLeft;
        } else {
          return (maxLeft + minRight) / 2.0;
        }
      }
    }

    return 0.;
  }
}
