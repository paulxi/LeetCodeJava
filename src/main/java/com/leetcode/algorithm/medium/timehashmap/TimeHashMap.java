package com.leetcode.algorithm.medium.timehashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//public class TimeHashMap<Key, Time, Value> {
//  private Map<Key, TreeMap<Time, Value>> map = new HashMap<>();


//  public Value get(Key key, Time time) {
//    TreeMap<Time, Value> treeMap = map.get(key);
//    if (treeMap == null) {
//      return null;
//    }
//
//    Time floorKey = treeMap.floorKey(time);
//    if (floorKey == null) {
//      return null;
//    } else {
//      return treeMap.get(floorKey);
//    }
//  }
//
//  public void put(Key key, Time time, Value value) {
//    if (!map.containsKey(key)) {
//      map.put(key, new TreeMap<>());
//    }
//    map.get(key).put(time, value);
//  }
//}

public class TimeHashMap<Key> {
  private Map<Key, TreeNode> map = new HashMap<>();

  private static final class TreeNode {
    double time;
    String val;
    TreeNode left;
    TreeNode right;

    TreeNode(double time, String val) {
      this.time = time;
      this.val = val;
    }
  }

  private void insert(TreeNode node, double time, String val) {
    if (node.time > time) {
      if (node.left == null) {
        node.left = new TreeNode(time, val);
      } else {
        insert(node.left, time, val);
      }
    } else {
      if (node.right == null) {
        node.right = new TreeNode(time, val);
      } else {
        insert(node.right, time, val);
      }
    }
  }

  private TreeNode search(TreeNode node, double time) {
    if (node == null) {
      return null;
    }

    if (node.time == time) {
      return node;
    }

    if (node.time > time) {
      return search(node.left, time);
    }

    TreeNode floor = search(node.right, time);
    if (floor == null) {
      return node;
    } else {
      return floor.time <= time ? floor : node;
    }
  }

  public String get(Key key, double time) {
    TreeNode node = map.get(key);
    if (node == null) {
      return null;
    }

    TreeNode floor = search(node, time);
    if (floor == null) {
      return null;
    } else {
      return floor.val;
    }
  }

  public void put(Key key, double time, String value) {
    if (!map.containsKey(key)) {
      map.put(key, new TreeNode(time, value));
      return;
    }
    TreeNode node = map.get(key);
    insert(node, time, value);
  }
}
