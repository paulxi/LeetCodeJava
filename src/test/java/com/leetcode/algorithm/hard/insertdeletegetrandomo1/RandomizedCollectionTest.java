package com.leetcode.algorithm.hard.insertdeletegetrandomo1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomizedCollectionTest {
  @Test
  public void testCase1() {
    // Init an empty set.
    RandomizedCollection collection = new RandomizedCollection();

    // Inserts 1 to the set. Returns true as 1 was inserted successfully.
    assertEquals(true, collection.insert(1));

    // Inserts another 1 to the collection. Returns false as the collection contained 1.
    // Collection now contains [1,1].
    assertEquals(false, collection.insert(1));

    // Inserts 2 to the set, returns true. Collection now contains [1,1,2].
    assertEquals(true, collection.insert(2));

    // getRandom should return either 1 or 2 randomly.
    assertEquals(true, Arrays.asList(1, 2).contains(collection.getRandom()));

    // Removes 1 from the set, returns true. Set now contains [2].
    assertEquals(true, collection.remove(1));

    // Since 2 is the only number in the set, getRandom always return 2.
    assertEquals(true, Arrays.asList(1, 2).contains(collection.getRandom()));
  }
}
