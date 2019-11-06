package com.leetcode.algorithm.medium.designfilesystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FileSystemTest {
  @Test
  public void testCase1() {
    FileSystem fs = new FileSystem();
    assertEquals(true, fs.createPath("/a", 1));
    assertEquals(1, fs.get("/a"));
  }

  @Test
  public void testCase2() {
    FileSystem fs = new FileSystem();
    assertEquals(true, fs.createPath("/leet", 1));
    assertEquals(true, fs.createPath("/leet/code", 2));
    assertEquals(2, fs.get("/leet/code"));
    assertEquals(false, fs.createPath("/c/d", 1));
    assertEquals(-1, fs.get("/c"));
  }
}
