package com.leetcode.algorithm.hard.streamofcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamCheckerTest {
  @Test
  public void testCase1() {
    StreamChecker streamChecker = new StreamChecker(new String[] {"cd","f","kl"});

    assertEquals(false, streamChecker.query('a'));          // return false
    assertEquals(false, streamChecker.query('b'));          // return false
    assertEquals(false, streamChecker.query('c'));          // return false
    assertEquals(true, streamChecker.query('d'));          // return true, because 'cd' is in the wordlist
    assertEquals(false, streamChecker.query('e'));          // return false
    assertEquals(true, streamChecker.query('f'));          // return true, because 'f' is in the wordlist
    assertEquals(false, streamChecker.query('g'));          // return false
    assertEquals(false, streamChecker.query('h'));          // return false
    assertEquals(false, streamChecker.query('i'));          // return false
    assertEquals(false, streamChecker.query('j'));          // return false
    assertEquals(false, streamChecker.query('k'));          // return false
    assertEquals(true, streamChecker.query('l'));          // return true, because 'kl' is in the wordlist
  }
}
