package com.leetcode.algorithm.medium.insertdeletegetrandomo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
  Map<Integer, Integer> map = new HashMap<>();
  ArrayList<Integer> list = new ArrayList<>();
  Random random = new Random();

  /** Initialize your data structure here. */
  public RandomizedSet() {

  }

  /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
  public boolean insert(int val) {
    if (map.containsKey(val)) {
      return false;
    }

    list.add(val);
    map.put(val, list.size() - 1);
    return true;
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    if (!map.containsKey(val)) {
      return false;
    }
    int index = map.get(val);
    map.remove(val);

    if (index != list.size() - 1) {
      int value = list.get(list.size() - 1);
      list.set(index, value);
      map.put(value, index);
    }

    list.remove(list.size() - 1);
    return true;
  }

  /** Get a random element from the set. */
  public int getRandom() {
    int index = random.nextInt(list.size());
    return list.get(index);
  }
}
