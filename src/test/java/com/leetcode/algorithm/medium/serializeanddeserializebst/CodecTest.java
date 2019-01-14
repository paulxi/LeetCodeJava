package com.leetcode.algorithm.medium.serializeanddeserializebst;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodecTest {
  @Test
  public void testCase1() {
    Codec codec = new Codec();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    assertEquals(root, codec.deserialize(codec.serialize(root)));
  }
}
