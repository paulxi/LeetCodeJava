package com.leetcode.algorithm.medium.encodeanddecodetinyurl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodecTest {
  @Test
  public void testCase1() {
    Codec codec = new Codec();
    String url = "https://leetcode.com/problems/designtinyurl";

    assertEquals(url, codec.decode(codec.encode(url)));
  }
}
