package com.leetcode.algorithm.medium.alindromepermutationii;

import java.util.*;

class Solution {
  public List<String> generatePalindromes(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int odd = 0;
    String mid = "";
    ArrayList<Character> charList = new ArrayList<>();
    for (char c: map.keySet()) {
      int count = map.get(c);
      if (count % 2 == 1) {
        odd++;
        mid += c;
      }

      for (int i = 0; i < count / 2; i++) {
        charList.add(c);
      }
    }

    if (odd > 1) {
      return new ArrayList<>();
    }

    char[] chars = new char[charList.size()];
    for (int i = 0; i < charList.size(); i++) {
      chars[i] = charList.get(i);
    }

    Arrays.sort(chars);

    List<String> result = new ArrayList<>();
    permutate(result, new StringBuilder(), chars, new boolean[chars.length], mid);

    return result;
  }

  private void permutate(List<String> result, StringBuilder sb, char[] chars, boolean[] used, String mid) {
    if (sb.length() == chars.length) {
      result.add(sb.toString() + mid + sb.reverse().toString());
      sb.reverse();
      return;
    }

    for (int i = 0; i < chars.length; i++) {
      if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {
        continue;
      }

      sb.append(chars[i]);
      used[i] = true;
      permutate(result, sb, chars, used, mid);
      used[i] = false;
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}
