package com.leetcode.algorithm.easy.printinorder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FooTest {
  String result;

  @BeforeEach
  public void setup() {
    result = "";
  }

  @AfterEach
  public void teardown() {
  }

  @Test
  public void testCase1() {
    Foo foo = new Foo();
    Runnable first =
        () -> result += "first";
    Runnable second =
        () -> result += "second";
    Runnable third =
        () -> result += "third";

    Thread t1 =
        new Thread(
            () -> {
              try {
                foo.first(first);
              } catch (Exception ex) {
                fail(ex);
              }
            });
    Thread t2 =
        new Thread(
            () -> {
              try {
                foo.second(second);
              } catch (Exception ex) {
                fail(ex);
              }
            });
    Thread t3 =
        new Thread(
            () -> {
              try {
                foo.third(third);
              } catch (Exception ex) {
                fail(ex);
              }
            });

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      t2.join();
      t3.join();
      assertEquals("firstsecondthird", result);
    } catch (Exception ex) {
      fail(ex);
    }
  }

  @Test
  public void testCase2() {
    Foo foo = new Foo();
    Runnable first =
        () -> result += "first";
    Runnable second =
        () -> result += "second";
    Runnable third =
        () -> result += "third";

    Thread t1 =
        new Thread(
            () -> {
              try {
                foo.first(first);
              } catch (Exception ex) {
                fail(ex);
              }
            });
    Thread t2 =
        new Thread(
            () -> {
              try {
                foo.second(second);
              } catch (Exception ex) {
                fail(ex);
              }
            });
    Thread t3 =
        new Thread(
            () -> {
              try {
                foo.third(third);
              } catch (Exception ex) {
                fail(ex);
              }
            });

    t1.start();
    t3.start();
    t2.start();

    try {
      t1.join();
      t3.join();
      t2.join();
      assertEquals("firstsecondthird", result);
    } catch (Exception ex) {
      fail(ex);
    }
  }
}
