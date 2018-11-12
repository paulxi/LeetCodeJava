package com.leetcode.algorithm.easy.uniqueemailaddresses;

import java.util.HashSet;

class Solution {
  public int numUniqueEmails(String[] emails) {
    HashSet<String> ans = new HashSet<>();

    for (String email : emails) {
      int index = email.indexOf("@");
      String domainName = email.substring(index + 1);
      String localName = email.substring(0, index);

      int plusIndex = localName.indexOf("+");
      if (plusIndex >= 0) {
        localName = email.substring(0, plusIndex);
      }

      int dotIndex = localName.indexOf(".");
      while (dotIndex >= 0) {
        localName = localName.substring(0, dotIndex) + localName.substring(dotIndex + 1);
        dotIndex = localName.indexOf(".", dotIndex);
      }

      ans.add(localName + "@" + domainName);
    }

    return ans.size();
  }
}
