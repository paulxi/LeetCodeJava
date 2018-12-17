package com.leetcode.algorithm.medium.bullsandcows;

import java.util.*;

class Solution {
//  public String getHint(String secret, String guess) {
//    Map<Character, Set<Integer>> secretMap = new HashMap<>();
//    for (int i = 0; i < secret.length(); i++) {
//      char c = secret.charAt(i);
//      Set<Integer> set = secretMap.get(c);
//      if (set == null) {
//        set = new HashSet<>();
//        secretMap.put(c, set);
//      }
//      set.add(i);
//    }
//
//    Map<Character, Set<Integer>> guessMap = new HashMap<>();
//    for (int i = 0; i < guess.length(); i++) {
//      char c = guess.charAt(i);
//      Set<Integer> set = guessMap.get(c);
//      if (set == null) {
//        set = new HashSet<>();
//        guessMap.put(c, set);
//      }
//      set.add(i);
//    }
//
//    int countA = 0;
//    int countB = 0;
//    for (char c: guessMap.keySet()) {
//      Set<Integer> guessSet = guessMap.get(c);
//      Set<Integer> secretSet = secretMap.get(c);
//      if (secretSet != null) {
//        int[] positions = new int[secretSet.size()];
//        int index = 0;
//        for (int pos: secretSet) {
//          positions[index] = pos;
//          index++;
//        }
//
//        for (int pos : positions) {
//          if (guessSet.contains(pos)) {
//            countA++;
//            guessSet.remove(pos);
//            secretSet.remove(pos);
//          }
//        }
//
//        countB += guessSet.size() < secretSet.size() ? guessSet.size() : secretSet.size();
//      }
//    }
//
//    return countA + "A" + countB + "B";
//  }

  public String getHint(String secret, String guess) {
    int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];

    for (int i = 0; i < secret.length(); i++) {
      int s = secret.charAt(i) - '0';
      int g = guess.charAt(i) - '0';
      if (s == g) {
        bulls++;
      } else {
        if (numbers[s] < 0) {
          cows++;
        }
        if (numbers[g] > 0) {
          cows++;
        }
        numbers[s]++;
        numbers[g]--;
      }
    }

    return bulls + "A" + cows + "B";
  }
}
