package com.leetcode.algorithm.easy.loggerratelimiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTest {
  @Test
  public void testCase1() {
    Logger logger = new Logger();
    assertEquals(true, logger.shouldPrintMessage(1, "foo"));
    assertEquals(true, logger.shouldPrintMessage(2, "bar"));
    assertEquals(false, logger.shouldPrintMessage(3, "foo"));
    assertEquals(false, logger.shouldPrintMessage(8, "bar"));
    assertEquals(false, logger.shouldPrintMessage(10, "bar"));
    assertEquals(true, logger.shouldPrintMessage(11, "foo"));
  }
}
