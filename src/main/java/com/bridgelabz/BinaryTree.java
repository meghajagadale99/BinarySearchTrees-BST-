package com.bridgelabz;

import java.util.Scanner;

public class BinaryTree<T extends Comparable<T>> {
    public BinaryNode<T> root;
    public int size;

    //add..................................................
    public void add(T data) {
        if (isEmpty()) {
            root = new BinaryNode<T>(data);
        } else {
            add(root, data);
        }
        size++;
        //print();
    }
    private boolean isEmpty() {
        return size == 0;
    }
    private void add(BinaryNode<T> node, T data) {
        if (data.compareTo(node.data) < 0) {
            if(node.left != null) {
                add(node.left, data);
            } else {
                node.left = new BinaryNode<T>(data);
                return;
            }
        } else if (data.compareTo(node.data) > 0) {
            if(node.right != null) {
                add(node.right, data);
            } else {
                node.right = new BinaryNode<T>(data);
                return;
            }
        }else {return;}
    }
    public int size() {
        System.out.println("Size of the tree is:" + size);
        return size;
    }


    //Print....................................................
    public void print() {
        System.out.print("Binary Tree: ");
        if(isEmpty()) {
            System.out.print("Empty");
        } else {
            System.out.println("\nInOrder: ");
            printInOrder(root);
            System.out.println("\nPostOrder: ");
            printPostOrder(root);
            System.out.println("\nPreOrder: ");
            printPreOrder(root);
        }
        System.out.print("\n");
    }

    private void printInOrder(BinaryNode<T> node) {
        if(node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.printf(" " + node.data);
        printInOrder(node.right);
    }

    private void printPreOrder(BinaryNode<T> node) {
        if(node == null) {
            return;
        }

        System.out.printf("%3d ", node.data);
        printInOrder(node.left);
        printInOrder(node.right);
    }

    private void printPostOrder(BinaryNode<T> node) {
        if(node == null) {
            return;
        }

        printInOrder(node.left);
        printInOrder(node.right);
        System.out.printf("%3d ", node.data);
    }
}