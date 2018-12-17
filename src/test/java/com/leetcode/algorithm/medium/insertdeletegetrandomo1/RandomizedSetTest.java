package com.leetcode.algorithm.medium.insertdeletegetrandomo1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomizedSetTest {
  @Test
  public void testCase1() {
    // Init an empty set.
    RandomizedSet randomSet = new RandomizedSet();

    // Inserts 1 to the set. Returns true as 1 was inserted successfully.
    assertEquals(true, randomSet.insert(1));

    // Returns false as 2 does not exist in the set.
    assertEquals(false, randomSet.remove(2));

    // Inserts 2 to the set, returns true. Set now contains [1,2].
    assertEquals(true, randomSet.insert(2));

    // getRandom should return either 1 or 2 randomly.
    assertEquals(true, Arrays.asList(1, 2).contains(randomSet.getRandom()));

    // Removes 1 from the set, returns true. Set now contains [2].
    assertEquals(true, randomSet.remove(1));

    // 2 was already in the set, so return false.
    assertEquals(false, randomSet.insert(2));

    // Since 2 is the only number in the set, getRandom always return 2.
    assertEquals(2, randomSet.getRandom());
  }
}
