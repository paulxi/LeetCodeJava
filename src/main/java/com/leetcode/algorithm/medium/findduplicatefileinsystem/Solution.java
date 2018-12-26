package com.leetcode.algorithm.medium.findduplicatefileinsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<List<String>> findDuplicate(String[] paths) {
    HashMap<String, List<String>> map = new HashMap<>();

    for (String path: paths) {
      String[] strs = path.split(" ");
      String folder = strs[0];
      for (int i = 1; i < strs.length; i++) {
        int index = strs[i].indexOf('(');
        String name = strs[i].substring(0, index);
        String content = strs[i].substring(index + 1, strs[i].length() - 1);

        List<String> list = map.get(content);
        if (list == null) {
          list = new ArrayList<>();
          map.put(content, list);
        }
        list.add(folder + "/" + name);
      }
    }

    ArrayList<List<String>> result = new ArrayList<>();
    for (List<String> list: map.values()) {
      if (list.size() > 1) {
        result.add(list);
      }
    }
    return result;
  }
}
