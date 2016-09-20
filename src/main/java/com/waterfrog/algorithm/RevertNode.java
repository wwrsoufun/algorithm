package com.waterfrog.algorithm;

/**
 * Created by wangwanru on 16/9/20.
 * 在不改变原有数据结构的情况下，将一个链表从尾到头打印
 */
public class RevertNode {

    public static void revert(Node node){
        if(node==null) {
            return;
        }
        revert(node.next);
        System.out.println(node.value);
    }

   static  class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node next(Node next){
            return this.next = next;
        }
    }

    public static void main(String[] args){
            Node node = new Node(1);
            node.next(new Node(2)).next(new Node(3)).next(new Node(4)).next(new Node(5));
                revert(node);
    }
}
