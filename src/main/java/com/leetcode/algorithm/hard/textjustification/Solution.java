package com.leetcode.algorithm.hard.textjustification;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> lines = new ArrayList<>();
    int index = 0;
    while (index < words.length) {
      int count = words[index].length();
      int next = index + 1;

      while (next < words.length) {
        if (words[next].length() + count + 1 > maxWidth) {
          break;
        }
        count += words[next].length() + 1;
        next++;
      }

      StringBuilder sb = new StringBuilder();
      int diff = next - index - 1;
      if (next == words.length || diff == 0) {
        for (int i = index; i < next; i++) {
          sb.append(words[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        for (int i = sb.length(); i < maxWidth; i++) {
          sb.append(" ");
        }
      } else {
        int spaces = (maxWidth - count) / diff;
        int r = (maxWidth - count) % diff;
        for (int i = index; i < next; i++) {
          sb.append(words[i]);
          if (i < next - 1) {
            for (int j = 0; j <= (spaces + ((i - index) < r ? 1: 0)); j++) {
              sb.append(" ");
            }
          }
        }
      }

      lines.add(sb.toString());
      index = next;
    }

    return lines;
  }
}
