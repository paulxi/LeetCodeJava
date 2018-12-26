package com.leetcode.algorithm.hard.basiccalculatoriv;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("-1*a", "14"),
        solution.basicCalculatorIV("e + 8 - a + 5", new String[] {"e"}, new int[] {1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("-1*pressure","5"),
        solution.basicCalculatorIV("e - 8 + temperature - pressure",
            new String[] {"e", "temperature"},
            new int[] {1, 12}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("1*e*e", "-64"),
        solution.basicCalculatorIV("(e + 8) * (e - 8)",
            new String[] {},
            new int[] {}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(),
        solution.basicCalculatorIV("7 - 7",
            new String[] {},
            new int[] {}));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("5*a*b*c"),
        solution.basicCalculatorIV("a * b * c + b * a * c * 4",
            new String[] {},
            new int[] {}));
  }

  @Test
  public void testCase6() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("-1*a*a*b*b", "2*a*a*b*c", "-1*a*a*c*c", "1*a*b*b*b", "-1*a*b*b*c", "-1*a*b*c*c", "1*a*c*c*c", "-1*b*b*b*c", "2*b*b*c*c", "-1*b*c*c*c", "2*a*a*b", "-2*a*a*c", "-2*a*b*b", "2*a*c*c", "1*b*b*b", "-1*b*b*c", "1*b*c*c", "-1*c*c*c", "-1*a*a", "1*a*b", "1*a*c", "-1*b*c"),
        solution.basicCalculatorIV("((a - b) * (b - c) + (c - a)) * ((a - b) + (b - c) * (c - a))",
            new String[] {},
            new int[] {}));
  }
}
