package com.waterfrog.algorithm;

/**
 * Created by wangwanru on 16/9/20.
 * 链表反转
 */
public class ReverseNode {

    /**
     * 迭代递归
     *
     * @param current
     * @return
     */

    public static Node reverse(Node current) {
        if (current == null || current.next == null) {
            return current;
        }
        Node nextNode = current.next;
        current.next = null;
        Node reverseRest = reverse(nextNode);
        nextNode.next = current;//依次赋值header
        return reverseRest;
    }

    /**
     * 非迭代模式
     *
     * @param current
     * @return
     */
    public static Node reverse1(Node current) {
        if (current == null || current.next == null) {
            System.out.println(current.value);
            return current;
        }
        Node preNode = null;
        Node nextNode = null;
        while (current != null) {
            //next node
            nextNode = current.next;
            //set pre node
            current.next = preNode;
            //reset preNode
            preNode = current;
            //set next node
            current = nextNode;
        }
        return preNode;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node next(Node next) {
            return this.next = next;
        }

    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next(new Node(2)).next(new Node(3)).next(new Node(4)).next(new Node(5));
        Node reverseNode = reverse(node);
        System.out.println(printNode(reverseNode));

        Node node1 = new Node(1);
        node1.next(new Node(2)).next(new Node(3)).next(new Node(4)).next(new Node(5));
        Node reverserNode1 = reverse1(node1);
        System.out.println(printNode(reverserNode1));
    }

    private static String printNode(Node node) {
        if (node == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Node current = node;
        do {
            stringBuilder.append(current.value+"\t");
            current = current.next;
        } while (current != null);
        return stringBuilder.toString();
    }
}
