package com.leetcode.algorithm.hard.wordladderii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
//  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//    List<List<String>> result = new ArrayList<>();
//    HashSet<String> set = new HashSet<>(wordList);
//
//    List<String> list = new ArrayList<>();
//    list.add(beginWord);
//    set.remove(beginWord);
//    findLadders(beginWord, endWord, set, list, result);
//    return result;
//  }
//
//  private void findLadders(String beginWord, String endWord, HashSet<String> words, List<String> paths,
//                           List<List<String>> result) {
//    if (beginWord.equals(endWord)) {
//      List<String> list = new ArrayList<>(paths);
//      if (result.size() > 0) {
//        int size = result.get(0).size();
//        int listSize = list.size();
//        if (size == listSize) {
//          result.add(list);
//        } else if (size > listSize) {
//          result.clear();
//          result.add(list);
//        }
//      } else {
//        result.add(list);
//      }
//    } else {
//      for (String word: words) {
//        if (isOneLetterDiff(beginWord, word)) {
//          paths.add(word);
//          HashSet<String> newSet = new HashSet<>(words);
//          newSet.remove(word);
//          findLadders(word, endWord, newSet, paths, result);
//          paths.remove(word);
//        }
//      }
//    }
//  }
//
//  private boolean isOneLetterDiff(String src, String dist) {
//    for (int i = 0; i < src.length(); i++) {
//      if (src.charAt(i) != dist.charAt(i)) {
//        return src.substring(i + 1).equals(dist.substring(i + 1));
//      }
//    }
//
//    return false;
//  }

  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    List<List<String>> res = new ArrayList<>();
    HashSet<String> dict = new HashSet<>(wordList);
    if(!dict.contains(endWord)){
      return res;
    }

    HashSet<String> begSet = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    begSet.add(beginWord);
    set2.add(endWord);
    HashMap<String, List<String>> map = new HashMap<>();
    bfs(map, begSet, set2, dict, false);

    List<String> path = new ArrayList<>();
    path.add(beginWord);
    dfs(res, path, map, beginWord, endWord);
    return res;
  }

  private void bfs(HashMap<String, List<String>> map, HashSet<String> begSet, HashSet<String> set2, HashSet<String> dict, boolean flip){
    if(begSet.isEmpty()){
      return;
    }

    if(begSet.size() > set2.size()){
      bfs(map, set2, begSet, dict, !flip);
      return;
    }

    boolean done = false;
    dict.removeAll(begSet);
    dict.removeAll(set2);

    HashSet<String> next = new HashSet<>();
    for(String str : begSet){
      char[] chs = str.toCharArray();
      for(int i = 0; i < chs.length; i++){
        char temp = chs[i];
        for(char ch = 'a'; ch <= 'z'; ch++){
          if(chs[i] != ch){
            chs[i] = ch;
            String word = new String(chs);

            String key = flip ? word : str;
            String val = flip ? str : word;

            List<String> list = map.get(key) == null ? new ArrayList<>() : map.get(key);

            if(set2.contains(word)){
              done = true;

              list.add(val);
              map.put(key, list);
            }

            if(!done && dict.contains(word)){
              next.add(word);

              list.add(val);
              map.put(key, list);
            }
          }
        }
        chs[i] = temp;
      }
    }

    if(!done){
      bfs(map, set2, next, dict, !flip);
    }
  }

  private void dfs(List<List<String>> res, List<String> path, HashMap<String, List<String>> map, String start, String end){
    if(start.equals(end)){
      res.add(new ArrayList<>(path));
      return;
    }

    if(!map.containsKey(start)){
      return;
    }

    for(String next : map.get(start)){
      path.add(next);
      dfs(res, path, map, next, end);
      path.remove(path.size() - 1);
    }
  }
}
