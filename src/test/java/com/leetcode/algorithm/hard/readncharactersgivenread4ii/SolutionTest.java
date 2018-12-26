package com.leetcode.algorithm.hard.readncharactersgivenread4ii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    AtomicInteger counter = new AtomicInteger();
    counter.set(0);
    Solution solution = new Solution();
    solution.function = (char[] chars) -> {
      if (counter.get() == 0) {
        counter.set(1);
        chars[0] = 'a';
        return 1;
      } else if (counter.get() == 1) {
        counter.set(2);
        chars[0] = 'b';
        chars[1] = 'c';
        return 2;
      } else {
        return 0;
      }
    };
    char[] buff = new char[1];
    assertEquals(1, solution.read(buff, 1));
    assertArrayEquals(new char[] {'a'}, buff);

    buff = new char[2];
    assertEquals(2, solution.read(buff, 2));
    assertArrayEquals(new char[] {'b', 'c'}, buff);

    assertEquals(0, solution.read(buff, 1));
  }

  @Test
  public void testCase2() {
    AtomicInteger counter = new AtomicInteger();
    counter.set(0);
    Solution solution = new Solution();
    solution.function = (char[] chars) -> {
      if (counter.get() == 0) {
        counter.set(1);
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        return 3;
      } else {
        return 0;
      }
    };
    char[] buff = new char[3];
    int total = solution.read(buff, 4);
    assertEquals(3, total);
    assertArrayEquals(new char[] {'a', 'b', 'c'}, buff);

    total = solution.read(buff, 1);
    assertEquals(0, total);
  }
}
