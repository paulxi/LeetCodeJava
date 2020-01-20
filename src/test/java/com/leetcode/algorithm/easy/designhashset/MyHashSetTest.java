package com.leetcode.algorithm.easy.designhashset;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyHashSetTest {
    @Test
    public void testCase1() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        assertTrue(hashSet.contains(1));    // returns true
        assertFalse(hashSet.contains(3));    // returns false (not found)
        hashSet.add(2);
        assertTrue(hashSet.contains(2));    // returns true
        hashSet.remove(2);
        assertFalse(hashSet.contains(2));    // returns false (already removed)
    }
}
