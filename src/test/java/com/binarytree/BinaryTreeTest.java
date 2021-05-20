package com.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * here i have created BinaryTreeTest class.
 */
public class BinaryTreeTest {
    /**
     * this test method will check the add method and size method.
     */
    @Test
    public void Elements_Added_Returns_Size3() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        Assertions.assertEquals(3, binaryTree.size());
    }
}
