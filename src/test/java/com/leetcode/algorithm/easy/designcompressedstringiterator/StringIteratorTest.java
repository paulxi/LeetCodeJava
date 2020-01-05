package com.leetcode.algorithm.easy.designcompressedstringiterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringIteratorTest {
    @Test
    public void testCase1() {
        StringIterator iterator = new StringIterator("L1e2t1C1o1d1e1");

        assertEquals('L', iterator.next()); // return 'L'
        assertEquals('e', iterator.next()); // return 'e'
        assertEquals('e', iterator.next()); // return 'e'
        assertEquals('t', iterator.next()); // return 't'
        assertEquals('C', iterator.next()); // return 'C'
        assertEquals('o', iterator.next()); // return 'o'
        assertEquals('d', iterator.next()); // return 'd'
        assertTrue(iterator.hasNext()); // return true
        assertEquals('e', iterator.next()); // return 'e'
        assertFalse(iterator.hasNext()); // return false
        assertEquals(' ', iterator.next()); // return ' '
    }
}
