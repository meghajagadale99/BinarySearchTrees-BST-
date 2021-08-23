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

    @Test
    public void binarySearchTreeSize() {
        BinaryTree<Integer> binaryTree = new BinaryTree();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(11);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(60);
        binaryTree.add(65);
        binaryTree.add(63);
        binaryTree.add(67);
        binaryTree.add(50);
        binaryTree.size();
        int size = binaryTree.size;
        Assert.assertEquals(13,size);
    }
    @Test
    public void binarySearchTreeSearchElement() {
        BinaryTree<Integer> binaryTree = new BinaryTree();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(11);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(60);
        binaryTree.add(65);
        binaryTree.add(63);
        binaryTree.add(67);
        binaryTree.add(50);
        Boolean result = binaryTree.search(63);
        Assert.assertTrue(result);
    }
}