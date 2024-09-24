package com.udemy.linkedlist.sll;

public class SingularLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public Node createSingleLinkedLinst(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
