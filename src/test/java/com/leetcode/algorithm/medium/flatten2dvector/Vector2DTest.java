package com.leetcode.algorithm.medium.flatten2dvector;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector2DTest {
  @Test
  public void testCase1() {
    List<List<Integer>> vec2d = Arrays.asList(
        Arrays.asList(1, 2),
        Arrays.asList(3),
        Arrays.asList(4, 5, 6)
    );

    Vector2D i = new Vector2D(vec2d);

    List<Integer> result = new ArrayList<>();
    while (i.hasNext()) {
      result.add(i.next());
    }

    assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), result);
  }
}
