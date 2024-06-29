package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_13_HollowTriangle
 * @date 2024/6/29 23:11
 * @package com.kamacoder
 * @description 13.镂空三角形
 */
public class k_13_HollowTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ch;
        while (in.hasNext() && !"@".equals(ch = in.next())) {
//            System.out.println(ch);
            int n = in.nextInt();
//            System.out.println(n);
            printTriangle(n, ch);
            System.out.println();
        }
    }
    private static void printTriangle(int n, String ch) {
        for (int i = 1; i <= n; ++ i) {
            // 输出空格
            for (int j = i; j < n; ++ j) {
                System.out.print(" ");
            }
            // 计算每行的长度
            int len = 2 * i - 1;
            // 输出字符
            for (int j = 1; j <= len; ++ j) {
                if (j == 1 || j == len || i == n) {
                    // 此时输出边上的字符
                    System.out.print(ch);
                } else {
                    // 否则输出空格
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
