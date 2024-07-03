package com.kamacoder;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_18_BasicOperationsLinkedList
 * @date 2024/7/3 13:42
 * @package com.kamacoder
 * @description 18. 链表的基本操作
 */
public class k_18_BasicOperationsLinkedList {
    static LinkedList<Integer> linkedList;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 获取序列长度
        int n = in.nextInt();
        linkedList = new LinkedList<>();
        // 从头插入序列
        while (n-- > 0) {
            linkedList.addFirst(in.nextInt());
        }
        // 获取接下来的操作次数
        int m = in.nextInt();
        while (m-- > 0) {
            String operation = in.next();
            switch (operation) {
                case "get":
                    get(in.nextInt());
                    break;
                case "insert":
                    insert(in.nextInt(), in.nextInt());
                    break;
                case "delete":
                    delete(in.nextInt());
                    break;
                case "show":
                    show();
                    break;
            }
        }
        // 清除
        linkedList.clear();
    }
    private static void get(int index) {
        int size = linkedList.size();
        if (index <= size && index >= 1) {
            System.out.println(linkedList.get(index-1));
        } else {
            System.out.println("get fail");
        }
    }
    private static void insert(int index, int element) {
        int size = linkedList.size();
        if (index <= size+1 && index >= 1) {
            linkedList.add(index-1, element);
            System.out.println("insert OK");
        } else {
            System.out.println("insert fail");
        }
    }
    private static void delete(int index) {
        int size = linkedList.size();
        if (index <= size && index >= 1) {
            linkedList.remove(index-1);
            System.out.println("delete OK");
        } else {
            System.out.println("delete fail");
        }
    }
    private static void show() {
        if (linkedList.isEmpty()) {
            System.out.println("Link list is empty");
        } else {
            // 按顺序输出
            int size = linkedList.size();
            for (int i = 0; i < size; ++ i) {
                System.out.print(linkedList.get(i));
                if (i != size-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
