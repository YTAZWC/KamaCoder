package com.kamacoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 花木凋零成兰
 * @title k_20_RemoveDuplicateElements
 * @date 2024/7/4 10:40
 * @package com.kamacoder
 * @description 20.删除重复元素
 */
public class k_20_RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            n = in.nextInt();
            ListNode first = new ListNode();
            ListNode end = first;
            while (n-- > 0) {
                end.next = new ListNode(in.nextInt());
                end = end.next;
            }
            if (first.next == null) {
                System.out.println("list is empty");
            } else {
                // 输出链表
                printList(first.next);
                // 去重
                removeDuplicateEle(first.next);
                // 输出去重结果
                printList(first.next);
            }
        }
    }
    // 去除链表中的重复元素
    private static void removeDuplicateEle(ListNode list) {
        Set<Integer> elements = new HashSet<>();
        // 遍历链表
        ListNode p = list;
        ListNode pre = new ListNode();
        pre.next = p;
        while (p != null) {
            if (!elements.contains(p.val)) {
                elements.add(p.val);
                pre = pre.next;
            } else {
                pre.next = p.next;
            }
            p = p.next;
        }
    }
    // 输出链表
    private static void printList(ListNode start) {
        while (start != null) {
            System.out.print(start.val + " ");
            start = start.next;
        }
        System.out.println();
    }
    // 自定义链表
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
