package com.leetcode.algorithm.hard.serializeanddeserializenarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.leetcode.algorithm.hard.serializeanddeserializenarytree.Codec.Node;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CodecTest {
  @Test
  public void testCase1() {
    Codec codec = new Codec();
    Node root = new Node(1, Arrays.asList(
        new Node(3, Arrays.asList(
            new Node(5, Arrays.asList()),
            new Node(6, Arrays.asList())
        )),
        new Node(2, Arrays.asList()),
        new Node(4, Arrays.asList())
    ));

    String serializedStr = codec.serialize(root);
    assertEquals("1,3,3,2,5,0,6,0,2,0,4,0", serializedStr);
    assertEquals(root, codec.deserialize(serializedStr));
  }
}
