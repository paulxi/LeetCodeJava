package com.leetcode.algorithm.medium.productofthelastknumbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfNumbersTest {
    @Test
    public void testCase1() {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        assertEquals(20, productOfNumbers.getProduct(2));
        assertEquals(40, productOfNumbers.getProduct(3));
        assertEquals(0, productOfNumbers.getProduct(4));
        productOfNumbers.add(8);
        assertEquals(32, productOfNumbers.getProduct(2));
    }
}
