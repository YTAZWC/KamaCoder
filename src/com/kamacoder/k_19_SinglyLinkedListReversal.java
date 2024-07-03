package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_19_SinglyLinkedListReversal
 * @date 2024/7/3 14:23
 * @package com.kamacoder
 * @description 19. 单链表反转
 */
public class k_19_SinglyLinkedListReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;  // 列表长度
        while (in.hasNext()) {
            n = in.nextInt();
            LinkedList first = new LinkedList();
            LinkedList end = first;
//            first.next = end;
            while (n-- > 0) {
                int val = in.nextInt();
                end.next = new LinkedList(val);
                end = end.next;
            }
            if (first.next != null) {
                // 输出正序
                for (LinkedList p = first.next; p != end.next; p = p.next) {
                    System.out.print(p.val + " ");
                }
                System.out.println();
                // 反转
                LinkedList q = first.next;
                while (q != end) {
                    // 取出节点
                    LinkedList temp = q;
                    q = q.next;
                    temp.next = null;
                    // 插入end之后
                    temp.next = end.next;
                    end.next = temp;
                }
                // 输出反转
                for (LinkedList i = end; i != null; i = i.next) {
                    System.out.print(i.val + " ");
                }
                System.out.println();
            } else {
                System.out.println("list is empty");
            }
        }
    }
    private static class LinkedList {
        int val;
        LinkedList next;
        public LinkedList() {
            this.next = null;
        }
        public LinkedList(int val) {
            this.val = val;
            this.next = null;
        }
        public LinkedList(int val, LinkedList next) {
            this.val = val;
            this.next = next;
        }
    }
}
