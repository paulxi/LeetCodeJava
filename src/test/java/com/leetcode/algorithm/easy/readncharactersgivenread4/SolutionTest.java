package com.leetcode.algorithm.easy.readncharactersgivenread4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    solution.function = (char[] chars) -> {
      chars[0] = 'a';
      chars[1] = 'b';
      chars[2] = 'c';
      return 3;
    };
    char[] buff = new char[3];
    int total = solution.read(buff, 4);
    assertEquals(3, total);
    assertArrayEquals(new char[] {'a', 'b', 'c'}, buff);
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
        chars[3] = 'd';
        return 4;
      } else {
        chars[0] = 'e';
        return 1;
      }
    };
    char[] buff = new char[5];
    int total = solution.read(buff, 5);
    assertEquals(5, total);
    assertArrayEquals(new char[] {'a', 'b', 'c', 'd', 'e'}, buff);
  }
}
