package com.leetcode.algorithm.medium.accountsmerge;

import java.util.*;

class Solution {
  static class DSU {
    int[] parent;
    int[] rank;

    DSU(int size) {
      parent = new int[size];
      rank = new int[size];
      for (int i = 0; i < size; i++) {
        parent[i] = i;
      }
    }

    int find(int x) {
      if (parent[x] != x) {
        parent[x] = find(parent[x]);
      }

      return parent[x];
    }

    boolean union(int x, int y) {
      int xr = find(x);
      int yr = find(y);
      if (xr == yr) {
        return false;
      }

      if (rank[xr] < rank[yr]) {
        parent[xr] = yr;
      } else if (rank[xr] > rank[yr]) {
        parent[yr] = xr;
      } else {
        parent[yr] = xr;
        rank[xr]++;
      }

      return true;
    }
  }


  public List<List<String>> accountsMerge(List<List<String>> accounts) {
    DSU dsu = new DSU(10001);

    Map<String, String> emailToName = new HashMap<>();
    Map<String, Integer> emailToID = new HashMap<>();

    int id = 0;
    for (List<String> account: accounts) {
      String name = null;

      for (String email: account) {
        if (name == null) {
          name = email;
          continue;
        }

        emailToName.put(email, name);
        if (!emailToID.containsKey(email)) {
          emailToID.put(email, id++);
        }

        dsu.union(emailToID.get(account.get(1)), emailToID.get(email));
      }
    }

    Map<Integer, List<String>> ans = new HashMap<>();
    for (String email: emailToName.keySet()) {
      int index = dsu.find(emailToID.get(email));
      ans.computeIfAbsent(index, x -> new ArrayList<>()).add(email);
    }

    for (List<String> emails: ans.values()) {
      Collections.sort(emails);
      emails.add(0, emailToName.get(emails.get(0)));
    }

    return new ArrayList<>(ans.values());
  }

//  public List<List<String>> accountsMerge(List<List<String>> accounts) {
//    Map<String, String> emailToName = new HashMap<>();
//    Map<String, List<String>> graph = new HashMap<>();
//
//    for (List<String> emails: accounts) {
//      String name = null;
//      for (String email: emails) {
//        if (name == null) {
//          name = email;
//          continue;
//        }
//        emailToName.put(email, name);
//
//        graph.computeIfAbsent(email, x -> new ArrayList<>()).add(emails.get(1));
//        graph.computeIfAbsent(emails.get(1), x -> new ArrayList<>()).add(email);
//      }
//    }
//
//    Set<String> seen = new HashSet<>();
//    List<List<String>> ans = new ArrayList<>();
//    for (String email: emailToName.keySet()) {
//      if (!seen.contains(email)) {
//        seen.add(email);
//        Stack<String> stack = new Stack<>();
//        stack.push(email);
//        List<String> component = new ArrayList();
//        while (!stack.isEmpty()) {
//          String node = stack.pop();
//          component.add(node);
//          for (String nei: graph.get(node)) {
//            if (!seen.contains(nei)) {
//              seen.add(nei);
//              stack.push(nei);
//            }
//          }
//        }
//
//        Collections.sort(component);
//        component.add(0, emailToName.get(email));
//        ans.add(component);
//      }
//    }
//
//    return ans;
//  }
}
