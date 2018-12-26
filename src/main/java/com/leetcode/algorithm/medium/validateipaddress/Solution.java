package com.leetcode.algorithm.medium.validateipaddress;

class Solution {
  public String validIPAddress(String IP) {
    if (IP.contains(":")) {
      return isValidIP6(IP) ? "IPv6" : "Neither";
    } else if (IP.contains(".")) {
      return isValidIP4(IP) ? "IPv4" : "Neither";
    } else {
      return "Neither";
    }
  }

  private boolean isValidIP4(String str) {
    if (str.startsWith(".") || str.endsWith(".")) {
      return false;
    }
    String[] ips = str.split("\\.");
    if (ips.length != 4) {
      return false;
    }

    for (String s: ips) {
      if (s.length() == 0 || s.length() > 3) {
        return false;
      }

      if (s.length() > 1 && s.charAt(0) == '0') {
        return false;
      }

      for (char c: s.toCharArray()) {
        boolean valid = c >= '0' && c <= '9';
        if (!valid) {
          return false;
        }
      }

      if (Integer.valueOf(s) > 255) {
        return false;
      }
    }

    return true;
  }

  private boolean isValidIP6(String str) {
    if (str.startsWith(":") || str.endsWith(":")) {
      return false;
    }
    String[] ips = str.split(":");
    if (ips.length != 8) {
      return false;
    }

    for (String s: ips) {
      if (s.length() > 4 || s.length() == 0) {
        return false;
      }

      for (char c: s.toCharArray()) {
        boolean valid = (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
        if (!valid) {
          return false;
        }
      }
    }

    return true;
  }
}
