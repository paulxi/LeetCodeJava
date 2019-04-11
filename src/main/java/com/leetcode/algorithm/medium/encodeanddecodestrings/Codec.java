package com.leetcode.algorithm.medium.encodeanddecodestrings;

import java.util.ArrayList;
import java.util.List;

public class Codec {

  // Encodes a list of strings to a single string.
  public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String str: strs) {
      sb.append(str.length()).append("|").append(str);
    }

    return sb.toString();
  }

  // Decodes a single string to a list of strings.
  public List<String> decode(String s) {
    List<String> list = new ArrayList<>();
    int i = 0;
    while (i < s.length()) {
      int seperator = s.indexOf('|', i);
      int len = Integer.valueOf(s.substring(i, seperator));
      i = seperator + len + 1;
      list.add(s.substring(seperator + 1, i));
    }

    return list;
  }
}
