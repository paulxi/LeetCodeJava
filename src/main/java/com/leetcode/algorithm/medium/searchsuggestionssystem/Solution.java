package com.leetcode.algorithm.medium.searchsuggestionssystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<String>> suggestedProducts(String[] products, String searchWord) {
    List<List<String>> ans = new ArrayList<>();
    Arrays.sort(products);
    for (int i = 1; i <= searchWord.length(); i++) {
      String cur = searchWord.substring(0, i);
      int k = Arrays.binarySearch(products, cur);
      while (k > 0 && cur.equals(products[k - 1])) {
        --k;
      }
      if (k < 0) {
        k = ~k;
      }
      List<String> suggestion = new ArrayList<>();
      for (int j = k + 3; k < products.length && k < j && products[k].startsWith(cur); k++) {
        suggestion.add(products[k]);
      }
      ans.add(suggestion);
    }
    return ans;
  }
}
