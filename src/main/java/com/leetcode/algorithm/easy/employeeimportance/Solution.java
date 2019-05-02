package com.leetcode.algorithm.easy.employeeimportance;

import java.util.*;

class Solution {
  final static class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
      this.id = id;
      this.importance = importance;
      this.subordinates = subordinates;
    }
  }

  public int getImportance(List<Employee> employees, int id) {
    Map<Integer, Employee> map = new HashMap<>();
    for (Employee e: employees) {
      map.put(e.id, e);
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.offer(id);
    int ans = 0;
    while (!queue.isEmpty()) {
      int eId = queue.poll();
      if (map.containsKey(eId)) {
        Employee employee = map.get(eId);
        ans += employee.importance;
        for (int sub: employee.subordinates) {
          queue.offer(sub);
        }
      }
    }

    return ans;
  }
}
