package com.leetcode.algorithm.medium.exclusivetimeoffunctions;

import java.util.List;
import java.util.Stack;

class Solution {
//  static class FunctionTime {
//    int id;
//    int timeUnits;
//
//    FunctionTime(int id) {
//      this.id = id;
//    }
//
//    void addTimeUnits(int units) {
//      this.timeUnits += units;
//    }
//  }
//
//  public int[] exclusiveTime(int n, List<String> logs) {
//    int[] result = new int[n];
//    Stack<FunctionTime> stack = new Stack<>();
//
//    int preTime = 0;
//    boolean isPreStart = false;
//    for (String str : logs) {
//      String[] strs = str.split(":");
//      int id = Integer.valueOf(strs[0]);
//      boolean isStart = strs[1].equals("start");
//      int time = Integer.valueOf(strs[2]);
//
//      if (stack.isEmpty()) {
//        FunctionTime ft = new FunctionTime(id);
//        stack.push(ft);
//      } else {
//        if (isStart) {
//          FunctionTime peek = stack.peek();
//          if (isPreStart) {
//            peek.addTimeUnits(time - preTime);
//          } else {
//            peek.addTimeUnits(time - preTime - 1);
//          }
//
//          FunctionTime ft = new FunctionTime(id);
//          stack.push(ft);
//        } else {
//          FunctionTime ft = stack.pop();
//          if (isPreStart) {
//            ft.addTimeUnits(time - preTime + 1);
//          } else {
//            ft.addTimeUnits(time - preTime);
//          }
//
//          result[id] += ft.timeUnits;
//        }
//      }
//
//      preTime = time;
//      isPreStart = isStart;
//    }
//
//    return result;
//  }

  public int[] exclusiveTime(int n, List<String> logs) {
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();
    int preTime = 0;
    for (String str: logs) {
      String[] parts = str.split(":");
      int id = Integer.valueOf(parts[0]);
      boolean isStart = parts[1].equals("start");
      int time = Integer.valueOf(parts[2]);

      if (!stack.isEmpty()) {
        result[stack.peek()] += time - preTime;
      }
      preTime = time;
      if (isStart) {
        stack.push(id);
      } else {
        result[stack.pop()]++;
        preTime++;
      }
    }

    return result;
  }
}
