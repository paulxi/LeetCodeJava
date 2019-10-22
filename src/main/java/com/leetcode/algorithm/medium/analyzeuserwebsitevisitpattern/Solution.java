package com.leetcode.algorithm.medium.analyzeuserwebsitevisitpattern;

import java.util.*;

class Solution {
  private static final class Visit {
    String username;
    int timestamp;
    String website;

    Visit(String username, int timestamp, String website) {
      this.username = username;
      this.timestamp = timestamp;
      this.website = website;
    }
  }

  public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
    int n = timestamp.length;
    List<Visit> sessions = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      sessions.add(new Visit(username[i], timestamp[i], website[i]));
    }
    sessions.sort(Comparator.comparingInt(a -> a.timestamp));

    Map<String, List<Visit>> visited = new HashMap<>();
    for (Visit v: sessions) {
      visited.putIfAbsent(v.username, new ArrayList<>());
      visited.get(v.username).add(v);
    }

    Map<String, Integer> sequence = new HashMap<>();
    int maxCount = 0;
    String maxSeq = "";
    for (String name: visited.keySet()) {
      List<Visit> list = visited.get(name);
      if (list.size() < 3) {
        continue;
      }
      Set<String> subsequences = subsequence(list);
      for (String seq: subsequences) {
        sequence.put(seq, sequence.getOrDefault(seq, 0) + 1);
        if (sequence.get(seq) > maxCount) {
          maxCount = sequence.get(seq);
          maxSeq = seq;
        } else if (sequence.get(seq) == maxCount && seq.compareTo(maxSeq) < 0) {
          maxSeq = seq;
        }
      }
    }
    return Arrays.asList(maxSeq.split(","));
  }

  private Set<String> subsequence(List<Visit> list) {
    int n = list.size();
    Set<String> res = new HashSet<>();
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          res.add(list.get(i).website + "," + list.get(j).website + "," + list.get(k).website);
        }
      }
    }
    return res;
  }
}
