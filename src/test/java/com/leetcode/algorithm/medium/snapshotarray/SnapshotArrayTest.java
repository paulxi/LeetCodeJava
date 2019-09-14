package com.leetcode.algorithm.medium.snapshotarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnapshotArrayTest {
  @Test
  public void testCase1() {
    SnapshotArray array = new SnapshotArray(3);
    array.set(0, 5);
    assertEquals(0, array.snap());
    array.set(0, 6);
    assertEquals(5, array.get(0, 0));
  }
}
