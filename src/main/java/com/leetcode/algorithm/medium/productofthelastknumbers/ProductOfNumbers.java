package com.leetcode.algorithm.medium.productofthelastknumbers;

import java.util.ArrayList;

class ProductOfNumbers {
    ArrayList<Integer> list = new ArrayList<>() {{
        add(1);
    }};

    public ProductOfNumbers() {
    }

    public void add(int num) {
        if (num > 0) {
            list.add(list.get(list.size() - 1) * num);
        } else {
            list = new ArrayList<>();
            list.add(1);
        }
    }

    public int getProduct(int k) {
        int n = list.size();
        return k < n ? list.get(n - 1) / list.get(n - k - 1) : 0;
    }
}
