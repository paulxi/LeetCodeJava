package com.leetcode.algorithm.hard.sortitemsbygroupsrespectingdependencies;

import java.util.*;

class Solution {
    Map<Integer, List<Integer>> groupGraph;
    Map<Integer, List<Integer>> itemGraph;

    int[] groupsIndegree;
    int[] itemsIndegree;

    private void buildGraphOfGroups(int[] group, List<List<Integer>> beforeItems, int n) {
        for (int i = 0; i < group.length; i++) {
            int toGroup = group[i];
            List<Integer> fromItems = beforeItems.get(i);
            for (int fromItem : fromItems) {
                int fromGroup = group[fromItem];
                if (fromGroup != toGroup) {
                    groupGraph.computeIfAbsent(fromGroup, x -> new ArrayList<>()).add(toGroup);
                    groupsIndegree[toGroup]++;
                }
            }
        }
    }

    private void buildGraphOfItems(List<List<Integer>> beforeItems, int n) {
        for (int i = 0; i < n; i++) {
            List<Integer> items = beforeItems.get(i);
            for (int item : items) {
                itemGraph.computeIfAbsent(item, x -> new ArrayList<>()).add(i);
                itemsIndegree[i]++;
            }
        }
    }

    private List<Integer> topologicalSortUtil(Map<Integer, List<Integer>> graph, int[] indegree, int n) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int key : graph.keySet()) {
            if (indegree[key] == 0) {
                queue.offer(key);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            n--;
            list.add(node);
            for (int neighbor : graph.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        return n == 0 ? list : new ArrayList<>();
    }

    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        groupGraph = new HashMap<>();
        itemGraph = new HashMap<>();

        // Each item belongs to a group. If an item doesn't have a group it forms it's own isolated group.
        for (int i = 0; i < group.length; i++) {
            if (group[i] == -1) {
                group[i] = m++;
            }
        }

        for (int i = 0; i < m; i++) {
            groupGraph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            itemGraph.put(i, new ArrayList<>());
        }

        groupsIndegree = new int[m];
        itemsIndegree = new int[n];

        // form graph structure across different groups and also calculate indegree.
        buildGraphOfGroups(group, beforeItems, n);

        // form graph structure across different items and also calculate indegree.
        buildGraphOfItems(beforeItems, n);

        // Topological ordering of the groups.
        List<Integer> groupsList = topologicalSortUtil(groupGraph, groupsIndegree, m);
        // Topological ordering of the items.
        List<Integer> itemsList = topologicalSortUtil(itemGraph, itemsIndegree, n);

        // Detect if there are any cycles.
        if (groupsList.size() == 0 || itemsList.size() == 0) {
            return new int[0];
        }

        // This Map holds relative order of items in the same group computed in the loop below.
        Map<Integer, List<Integer>> groupsToItems = new HashMap<>();
        for (int item : itemsList) {
            groupsToItems.computeIfAbsent(group[item], x -> new ArrayList<>()).add(item);
        }

        int[] ans = new int[n];
        int idx = 0;
        for (int grp : groupsList) {
            List<Integer> items = groupsToItems.getOrDefault(grp, new ArrayList<>());
            for (int item : items) {
                ans[idx++] = item;
            }
        }

        return ans;
    }
}
