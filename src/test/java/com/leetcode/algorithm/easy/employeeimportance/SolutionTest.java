package com.leetcode.algorithm.easy.employeeimportance;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.leetcode.algorithm.easy.employeeimportance.Solution.Employee;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<Employee> employees = Arrays.asList(
        new Employee(1, 5, Arrays.asList(2, 3)),
        new Employee(2, 3, Arrays.asList()),
        new Employee(3, 3, Arrays.asList())
    );
    assertEquals(11, solution.getImportance(employees, 1));
  }
}
