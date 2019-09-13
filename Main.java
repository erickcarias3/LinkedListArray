package com.assignment2;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {

        LinkedListStack<String> stack = new LinkedListStack<String>();

        String[] toBePushed = {"test", "a", "is", "this", "hello"};

        System.out.println("Testing push() method...\n");
        for(int i = 0; i < toBePushed.length; i ++){
            System.out.println("Pushing " + toBePushed[i] + "\n");
            stack.push(toBePushed[i]);
            System.out.println("Stack after pushed : " + stack.toString() + "\n");
        }

        System.out.println("\nTesting size() method...");
        System.out.println("Should print out 5: " + stack.size());

        System.out.println("\nTesting peak() method...");
        System.out.println("Should print out 'hello' : " + stack.peak());

        System.out.println("\nTesting pop() and isEmpty() method...");
        while(!stack.isEmpty()){
            System.out.println("\nPopping '" + stack.pop() + "' from stack\n");
            System.out.println("Stack after pushed : " + stack.toString() + "\n");
        }

        System.out.println("\nThe size of stack should be 0 now : " + stack.size());

        System.out.println("\nShould throw an Exception if we call pop() now : \n");
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Exception caught : Empty Stack");
        }
    }
}