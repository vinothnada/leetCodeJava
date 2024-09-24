package com.udemy.linkedlist.sll;

public class Main {
    public static void main(String[] args) {
        SingularLinkedList sl = new SingularLinkedList();
        sl.createSingleLinkedLinst(5);
        System.out.println(sl.head.value);
    }
}
