package com.leetcode.algorithm.hard.slidingpuzzle;

import java.util.*;

class Solution {
//  public int slidingPuzzle(int[][] board) {
//    int rows = 2;
//    int cols = 3;
//
//    int sr = 0;
//    int sc = 0;
//
//    for (int i = 0; i < rows; i++) {
//      for (int j = 0; j < cols; j++) {
//        if (board[i][j] == 0) {
//          sr = i;
//          sc = j;
//          break;
//        }
//      }
//    }
//
//    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
//    Queue<Node> queue = new LinkedList<>();
//    Node start = new Node(board, sr, sc, 0);
//    queue.offer(start);
//
//    Set<String> seen = new HashSet<>();
//    seen.add(start.boardstring);
//
//    String target = Arrays.deepToString(new int[][]{{1,2,3}, {4,5,0}});
//    while (!queue.isEmpty()) {
//      Node node = queue.poll();
//      if (node.boardstring.equals(target)) {
//        return node.depth;
//      }
//
//      for (int[] dir: dirs) {
//        int x = dir[0] + node.row;
//        int y = dir[1] + node.col;
//
//        if (x >= 0 && x < rows && y >= 0 && y < cols) {
//          int[][] newboard = new int[rows][cols];
//          for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//              newboard[i][j] = node.board[i][j];
//            }
//          }
//
//          newboard[node.row][node.col] = newboard[x][y];
//          newboard[x][y] = 0;
//
//          Node newNode = new Node(newboard, x, y, node.depth + 1);
//          if (seen.contains(newNode.boardstring)) {
//            continue;
//          }
//          queue.add(newNode);
//          seen.add(newNode.boardstring);
//        }
//      }
//    }
//    return -1;
//  }
//
//  private static final class Node {
//    int[][] board;
//    int row;
//    int col;
//    int depth;
//    String boardstring;
//
//    Node(int[][] board, int row, int col, int depth) {
//      this.board = board;
//      this.boardstring = Arrays.deepToString(board);
//      this.row = row;
//      this.col = col;
//      this.depth = depth;
//    }
//  }

  public int slidingPuzzle(int[][] board) {
    String target = "123450";
    String start = "";

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        start += board[i][j];
      }
    }

    Queue<String> queue = new LinkedList<>();
    Set<String> seen = new HashSet<>();
    queue.offer(start);
    seen.add(start);

    int[][] dirs = new int[][] {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};

    int ans = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        String cur = queue.poll();

        if (cur.equals(target)) {
          return ans;
        }

        int zero = cur.indexOf('0');

        for (int d: dirs[zero]) {
          String next = swap(cur, zero, d);
          if (!seen.contains(next)) {
            queue.offer(next);
            seen.add(next);
          }
        }
      }

      ans++;
    }

    return -1;
  }

  private String swap(String str, int i, int j) {
    StringBuilder sb = new StringBuilder(str);
    sb.setCharAt(i, str.charAt(j));
    sb.setCharAt(j, str.charAt(i));
    return sb.toString();
  }
}
