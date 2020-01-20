package com.leetcode.algorithm.hard.dinnerplatestacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DinnerPlatesTest {
    @Test
    public void testCase1() {
        DinnerPlates dinnerPlates = new DinnerPlates(2);
        dinnerPlates.push(1);
        dinnerPlates.push(2);
        dinnerPlates.push(3);
        dinnerPlates.push(4);
        dinnerPlates.push(5);
        assertEquals(2, dinnerPlates.popAtStack(0));
        dinnerPlates.push(20);
        dinnerPlates.push(21);
        assertEquals(20, dinnerPlates.popAtStack(0));
        assertEquals(21, dinnerPlates.popAtStack(2));
        assertEquals(5, dinnerPlates.pop());
        assertEquals(4, dinnerPlates.pop());
        assertEquals(3, dinnerPlates.pop());
        assertEquals(1, dinnerPlates.pop());
        assertEquals(-1, dinnerPlates.pop());
    }
}
