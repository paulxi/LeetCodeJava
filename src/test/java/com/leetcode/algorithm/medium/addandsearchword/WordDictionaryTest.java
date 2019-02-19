package com.leetcode.algorithm.medium.addandsearchword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordDictionaryTest {
  @Test
  public void testCase1() {
    WordDictionary dict = new WordDictionary();
    dict.addWord("bad");
    dict.addWord("dad");
    dict.addWord("mad");

    assertEquals(false, dict.search("pad"));
    assertEquals(true, dict.search("bad"));
    assertEquals(true, dict.search(".ad"));
    assertEquals(true, dict.search("b.."));
  }

  @Test
  public void testCase2() {
    WordDictionary dict = new WordDictionary();
    dict.addWord("a");
    dict.addWord("ab");

    assertEquals(true, dict.search("a"));
    assertEquals(true, dict.search("a."));
    assertEquals(true, dict.search("ab"));
    assertEquals(false, dict.search(".a"));
    assertEquals(true, dict.search(".b"));
    assertEquals(false, dict.search("ab."));
    assertEquals(true, dict.search("."));
    assertEquals(true, dict.search(".."));
  }
}
