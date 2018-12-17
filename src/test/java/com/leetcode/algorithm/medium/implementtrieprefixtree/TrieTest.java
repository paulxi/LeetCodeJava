package com.leetcode.algorithm.medium.implementtrieprefixtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrieTest {
  @Test
  public void testCase1() {
    Trie trie = new Trie();
    trie.insert("apple");
    assertEquals(true, trie.search("apple"));
    assertEquals(false, trie.search("app"));
    assertEquals(true, trie.startsWith("app"));
    trie.insert("app");
    assertEquals(true, trie.search("app"));
  }
}
