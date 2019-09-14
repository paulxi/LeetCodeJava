package com.leetcode.algorithm.medium.snapshotarray;

import java.util.TreeMap;

class SnapshotArray {
  TreeMap<Integer, Integer>[] snapshots;
  int snapId = 0;

  public SnapshotArray(int length) {
    snapshots = new TreeMap[length];
    for (int i = 0; i < length; i++) {
      snapshots[i] = new TreeMap<>();
      snapshots[i].put(0, 0);
    }
  }

  public void set(int index, int val) {
    snapshots[index].put(snapId, val);
  }

  public int snap() {
    return snapId++;
  }

  public int get(int index, int snap_id) {
    return snapshots[index].floorEntry(snap_id).getValue();
  }
}
