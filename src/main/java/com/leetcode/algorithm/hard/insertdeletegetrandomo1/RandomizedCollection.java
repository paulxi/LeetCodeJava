package com.leetcode.algorithm.hard.insertdeletegetrandomo1;

import java.util.*;

public class RandomizedCollection {
  ArrayList<Integer> list = new ArrayList<>();
  HashMap<Integer, Set<Integer>> map = new HashMap<>();
  Random random = new Random();

  /** Initialize your data structure here. */
  public RandomizedCollection() {

  }

  /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
  public boolean insert(int val) {
    list.add(val);
    Set<Integer> indexes = map.get(val);
    if (indexes == null) {
      indexes = new HashSet<>();
      map.put(val, indexes);
      indexes.add(list.size() - 1);
      return true;
    } else {
      indexes.add(list.size() - 1);
      return false;
    }
  }

  /** Removes a value from the collection. Returns true if the collection contained the specified element. */
  public boolean remove(int val) {
    Set<Integer> indexes = map.get(val);
    if (indexes == null) {
      return false;
    }

    int index = indexes.iterator().next();
    indexes.remove(index);
    if (indexes.isEmpty()) {
      map.remove(val);
    }

    if (index != list.size() - 1) {
      int v = list.get(list.size() - 1);
      list.set(index, v);

      Set<Integer> vSet = map.get(v);
      vSet.remove(list.size() - 1);
      vSet.add(index);
    }
    list.remove(list.size() - 1);

    return true;
  }

  /** Get a random element from the collection. */
  public int getRandom() {
    int index = random.nextInt(list.size());
    return list.get(index);
  }
}
