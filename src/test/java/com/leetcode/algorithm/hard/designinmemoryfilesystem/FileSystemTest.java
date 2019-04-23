package com.leetcode.algorithm.hard.designinmemoryfilesystem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileSystemTest {
  @Test
  public void testCase1() {
    FileSystem fs = new FileSystem();
    assertEquals(Arrays.asList(), fs.ls("/"));
    fs.mkdir("/a/b/c");
    fs.addContentToFile("/a/b/c/d", "hello");
    assertEquals(Arrays.asList("a"), fs.ls("/"));
    assertEquals("hello", fs.readContentFromFile("/a/b/c/d"));
  }
}
