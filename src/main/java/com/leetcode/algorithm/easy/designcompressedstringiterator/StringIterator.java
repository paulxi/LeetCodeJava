package com.leetcode.algorithm.easy.designcompressedstringiterator;

import java.util.LinkedList;
import java.util.Queue;

class StringIterator {
    Queue<int[]> queue = new LinkedList<>();

    public StringIterator(String compressedString) {
        int i = 0;
        int n = compressedString.length();
        while (i < n) {
            int j = i + 1;
            while (j < n && compressedString.charAt(j) - 'A' < 0) {
                j++;
            }
            queue.offer(new int[] {compressedString.charAt(i) - 'A', Integer.parseInt(compressedString.substring(i + 1, j))});
            i = j;
        }
    }

    public char next() {
        if (queue.isEmpty()) {
            return ' ';
        }
        int[] top = queue.peek();
        if (--top[1] == 0) {
            queue.poll();
        }
        return (char)('A' + top[0]);
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
