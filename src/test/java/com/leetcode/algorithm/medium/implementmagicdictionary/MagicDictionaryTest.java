package com.leetcode.algorithm.medium.implementmagicdictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicDictionaryTest {
  @Test
  public void testCase1() {
    MagicDictionary dictionary = new MagicDictionary();
    dictionary.buildDict(new String[] {"hello", "leetcode"});
    assertEquals(false, dictionary.search("hello"));
    assertEquals(true, dictionary.search("hhllo"));
    assertEquals(false, dictionary.search("hell"));
    assertEquals(false, dictionary.search("leetcoded"));
  }
}
