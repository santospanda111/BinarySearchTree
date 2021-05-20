package com.binarytree;

/**
 * this is a generic class of type T.
 * @param <T>
 */
public class BinaryNode<T> {
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;

    /**
     * this constructor initialize the data,left value and right value.
     * @param data
     */
    public BinaryNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /**
     * this class have these getdata to get the values and setdata method to assign values.
     * @return
     */
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public  BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right =right;
    }
}
