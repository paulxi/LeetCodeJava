package com.leetcode.algorithm.medium.designsnakegame;

import java.util.LinkedList;
import java.util.Objects;

class SnakeGame {

  private int score;
  private int rows;
  private int cols;
  private int[][] food;
  private LinkedList<Point> snake;

  /**
   * Initialize your data structure here.
   *
   * @param width  - screen width
   * @param height - screen height
   * @param food   - A list of food positions
   *               E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0].
   */
  public SnakeGame(int width, int height, int[][] food) {
    this.score = 0;
    this.rows = height;
    this.cols = width;
    this.food = food;
    this.snake = new LinkedList<>();
    this.snake.add(new Point(0, 0));
  }

  /**
   * Moves the snake.
   *
   * @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
   * @return The game's score after the move. Return -1 if game over.
   * Game over when snake crosses the screen boundary or bites its body.
   */
  public int move(String direction) {
    Point curr = new Point(snake.get(0).x, snake.get(0).y);

    switch (direction) {
      case "U":
        curr.x--;
        break;
      case "L":
        curr.y--;
        break;
      case "R":
        curr.y++;
        break;
      case "D":
        curr.x++;
        break;
    }

    if (curr.x < 0 || curr.x >= rows || curr.y < 0 || curr.y >= cols) {
      return -1;
    }

    for (int i = 1; i < snake.size() - 1; i++) {
      Point next = snake.get(i);
      if (next.equals(curr)) {
        return -1;
      }
    }
    snake.addFirst(curr);
    if (score < food.length) {
      Point p = new Point(food[score][0], food[score][1]);
      if (curr.equals(p)) {
        score++;
      }
    }

    if (snake.size() > score + 1) {
      snake.removeLast();
    }

    return score;
  }

  static class Point {
    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }

      if (obj instanceof Point) {
        Point p = (Point) obj;
        return x == p.x && y == p.y;
      }

      return false;
    }

    @Override
    public int hashCode() {
      return Objects.hash(x, y);
    }
  }
}
