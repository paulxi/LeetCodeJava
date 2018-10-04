package com.leetcode.algorithm.hard.serializeanddeserializebinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class CodecTest {
  @Test
  public void testCase1() {
    Codec codec = new Codec();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);

    String serializedStr = codec.serialize(root);
    assertEquals("[1,2,3,null,null,4,null,null,5,null,null]", serializedStr);
    assertEquals(root, codec.deserialize(serializedStr));
  }
}
