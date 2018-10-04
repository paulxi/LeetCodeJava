package com.leetcode.algorithm.hard.serializeanddeserializebinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec {
  private String rserialize(TreeNode root, String str) {
    // Recursive serialization.
    if (root == null) {
      str += "null,";
    } else {
      str += str.valueOf(root.val) + ",";
      str = rserialize(root.left, str);
      str = rserialize(root.right, str);
    }
    return str;
  }

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    String result = rserialize(root, "");
    result = "[" + result.substring(0, result.length() - 1) + "]";
    return result;
  }

  private TreeNode rdeserialize(List<String> l) {
    // Recursive deserialization.
    if (l.get(0).equals("null")) {
      l.remove(0);
      return null;
    }

    TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
    l.remove(0);
    root.left = rdeserialize(l);
    root.right = rdeserialize(l);

    return root;
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    if (data == null || data.length() == 0) {
      return null;
    }
    String str = data;
    if (str.charAt(0) == '[') {
      str = str.substring(1);
    }
    if (str.charAt(str.length() - 1) == ']') {
      str = str.substring(0, str.length() - 1);
    }
    String[] data_array = str.split(",");
    List<String> data_list = new LinkedList<>(Arrays.asList(data_array));
    return rdeserialize(data_list);
  }
}
