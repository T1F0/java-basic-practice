package com.supconit.study.algorithmPractice;

import java.util.Scanner;

public class LiatNodeTest {
    static class ListNode{
        public int data;
        public ListNode next;
        public ListNode() {

        }
        public ListNode(int _data) {
            data = _data;
        }
    }
    //ListNode head
    public static ListNode reverseList() {
        ListNode listNode = new ListNode();
        return listNode;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        reverseList();
    }
}
