package com.leetcode.algorithm.medium.onlineelection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopVotedCandidateTest {
  @Test
  public void testCase1() {
    TopVotedCandidate obj =
        new TopVotedCandidate(
            new int[] {0, 1, 1, 0, 0, 1, 0}, new int[] {0, 5, 10, 15, 20, 25, 30});
    assertEquals(0, obj.q(3));
    assertEquals(1, obj.q(12));
    assertEquals(1, obj.q(25));
    assertEquals(0, obj.q(15));
    assertEquals(0, obj.q(24));
    assertEquals(1, obj.q(8));
  }
}
