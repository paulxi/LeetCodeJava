package com.leetcode.algorithm.medium.designlogstoragesystem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogSystemTest {
  @Test
  public void testCase1() {
    LogSystem logSystem = new LogSystem();

    logSystem.put(1, "2017:01:01:23:59:59");
    logSystem.put(2, "2017:01:01:22:59:59");
    logSystem.put(3, "2016:01:01:00:00:00");
    assertEquals(
        Arrays.asList(3, 2, 1),
        logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year"));
    assertEquals(
        Arrays.asList(2, 1),
        logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour"));
  }
}
