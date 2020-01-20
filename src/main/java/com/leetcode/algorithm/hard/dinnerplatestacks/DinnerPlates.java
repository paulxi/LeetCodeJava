package com.leetcode.algorithm.hard.dinnerplatestacks;

import java.util.*;

class DinnerPlates {
    private final int capacity;
    private final TreeMap<Integer, Deque<Integer>> stacks;
    private final TreeSet<Integer> avail;

    public DinnerPlates(int capacity) {
        this.capacity = capacity;
        stacks = new TreeMap<>();
        avail = new TreeSet<>();
    }

    public void push(int val) {
        int index = 0;
        if (avail.isEmpty()) {
            Map.Entry<Integer, Deque<Integer>> e = stacks.lastEntry();
            if (e != null) {
                index = e.getKey() + 1;
            }
            avail.add(index);
        } else {
            index = avail.first();
        }
        Deque<Integer> stack = stacks.getOrDefault(index, new ArrayDeque<>());
        stack.push(val);
        if (stack.size() == capacity) {
            avail.remove(index);
        }
        stacks.put(index, stack);
    }

    public int pop() {
        if (stacks.isEmpty()) {
            return -1;
        }
        return popAtStack(stacks.lastKey());
    }

    public int popAtStack(int index) {
        if (!stacks.containsKey(index)) {
            return -1;
        }
        Deque<Integer> stack = stacks.get(index);
        int res = stack.pop();
        if (stack.size() == 0) {
            stacks.remove(index);
        }
        avail.add(index);
        return res;
    }
}
