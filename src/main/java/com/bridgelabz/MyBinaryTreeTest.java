package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void binarySearchTreeSize3() {
        BinaryTree<Integer> binaryTree = new BinaryTree();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.print();
        int size = binaryTree.size;
        Assert.assertEquals(3,size);
    }

}