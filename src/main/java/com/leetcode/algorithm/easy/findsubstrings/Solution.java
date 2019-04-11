package com.leetcode.algorithm.easy.findsubstrings;

class Solution {
  public String[] findSubstrings(String[] words, String[] parts) {
    String[] ans = new String[words.length];
    for (int i = 0; i < words.length; i++) {
      ans[i] = find(words[i], parts);
    }

    return ans;
  }

  private String find(String word, String[] parts) {
    boolean found = false;
    int maxLength = 0;
    int maxIndex = 0;

    for (int i = 0; i < parts.length; i++) {
      int index = word.indexOf(parts[i]);
      if (index >= 0) {
        found = true;
        if (maxLength < parts[i].length()) {
          maxIndex = index;
          maxLength = parts[i].length();
        }
      }
    }

    if (found) {
      String first = word.substring(0, maxIndex);
      String second = word.substring(maxIndex, maxIndex + maxLength);
      String last = word.substring(maxIndex + maxLength);

      return first + "[" + second + "]" + last;
    }

    return word;
  }
}
