package com.assignment2;

/**
 * Created by luqikaii on 6/20/15.
 */
public class LinearNode<T> {

    private LinearNode<T> next;

    private T element;

    public LinearNode() {
        next = null;
        element = null;
    }

    public LinearNode(T value) {
        next = null;
        element = value;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext (LinearNode<T> node) {
        next = node;
    }

    public void setElement ( T value) {
        element = value;
    }

    public T getElement () {
        return element;
    }
}