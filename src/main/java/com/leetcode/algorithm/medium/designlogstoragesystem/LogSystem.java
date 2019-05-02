package com.leetcode.algorithm.medium.designlogstoragesystem;

import java.util.*;

class LogSystem {
  TreeMap<String, Integer> logs = new TreeMap<>();
  List<String> gras = Arrays.asList("Year", "Month", "Day", "Hour", "Minute", "Second");
  int[] range = new int[] {4, 7, 10, 13, 16, 19};

  public LogSystem() {

  }

  public void put(int id, String timestamp) {
    logs.put(timestamp, id);
  }

  public List<Integer> retrieve(String s, String e, String gra) {
    List<Integer> res = new ArrayList<>();
    int pos = range[gras.indexOf(gra)];

    String sBlank = "0000:00:00:00:00:00";
    String eBlank = "0000:12:31:23:59:59";

    String start = s.substring(0, pos) + sBlank.substring(pos);
    String end = e.substring(0, pos) + eBlank.substring(pos);

    String sKey = logs.ceilingKey(start);
    String eKey = logs.floorKey(end);

    if (sKey == null || eKey == null || eKey.compareTo(sKey) < 0) {
      return res;
    }

    Map<String, Integer> sub = logs.subMap(sKey, true, eKey, true);
    for (String k: sub.keySet()) {
      res.add(sub.get(k));
    }

    return res;
  }
}
