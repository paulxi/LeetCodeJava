package com.leetcode.algorithm.medium.buildingh2o;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class H2OTest {
  @Test
  public void testCase1() throws InterruptedException {
    H2O h2o = new H2O();
    StringBuilder sb = new StringBuilder();

    Runnable first =
        () -> sb.append("H");
    Runnable second =
        () -> sb.append("H");
    Runnable third =
        () -> sb.append("O");

    Thread h1 =
        new Thread(
            () -> {
              try {
                h2o.hydrogen(first);
              } catch (Exception ex) {
                fail(ex);
              }
            });
    Thread h2 =
        new Thread(
            () -> {
              try {
                h2o.hydrogen(second);
              } catch (Exception ex) {
                fail(ex);
              }
            });
    Thread o =
        new Thread(
            () -> {
              try {
                h2o.oxygen(third);
              } catch (Exception ex) {
                fail(ex);
              }
            });

    h1.start();
    h2.start();
    o.start();

    try {
      h1.join();
      h2.join();
      o.join();
      char[] chars = sb.toString().toCharArray();
      Arrays.sort(chars);
      assertArrayEquals(new char[] {'H', 'H', 'O'}, chars);
    } catch (Exception ex) {
      fail(ex);
    }
  }
}
