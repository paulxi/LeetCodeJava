package com.leetcode.algorithm.medium.encodeanddecodestrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodecTest {
  @Test
  public void testCase1() {
    Codec codec = new Codec();
    assertEquals("5|hello0|5|world", codec.encode(Arrays.asList("hello", "", "world")));
    assertEquals(Arrays.asList("hello", "", "world"), codec.decode("5|hello0|5|world"));
  }
}
