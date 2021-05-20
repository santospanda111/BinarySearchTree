package com.binarytree;

public class BinaryTree<T extends Comparable> {
    private BinaryNode<T> root;

    /**
     * this method will call addRecursively method by passing data
     * where root will be assigned as per the returned values from addRecursively method.
     * @param data
     */
    public void add(T data) {
        this.root = addRecursively(root, data);
    }

    public BinaryNode<T> addRecursively(BinaryNode<T> root, T data) {
        if(root == null)
            return new BinaryNode<T>(data);
        else if(root.getData().compareTo(data) > 0)
            root.left = addRecursively(root.left, data);
        else if(root.getData().compareTo(data) == 0)
            return root;
        else
            root.right = addRecursively(root.right, data);
        return root;
    }

    /**
     * this method will call the sizeofbinarytree method passing root
     * return the size of the binarytree.
     * @return
     */
    public int size() {
        return sizeOfBinarySearchTree(root);
    }

    public  int sizeOfBinarySearchTree(BinaryNode<T> root) {
        if(root == null)
            return 0;
        else
            return 1 + sizeOfBinarySearchTree(root.left) + sizeOfBinarySearchTree(root.right);
    }

}
