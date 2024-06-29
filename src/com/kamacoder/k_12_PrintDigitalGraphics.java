package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_12_PrintDigitalGraphics
 * @date 2024/6/29 21:20
 * @package com.kamacoder
 * @description 12. 打印数字图形
 */
public class k_12_PrintDigitalGraphics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;  // 读取每组输入
        while (in.hasNext()) {
            n = in.nextInt();
            printDigital(n);
        }
    }
    private static void printDigital(int n) {
        for (int i = 1; i <= n; ++ i) {
            printNum(n, i);
        }
        for (int i = n-1; i >= 1; -- i) {
            printNum(n, i);
        }
    }
    private static void printNum(int n, int i) {
        for (int j = i; j < n; ++ j) {
            System.out.print(" ");
        }
        int j;
        for (j = 1; j <= i; ++ j) {
            System.out.print(j);
        }
        for (j = j-2; j >= 1; --j) {
            System.out.print(j);
        }
        System.out.println();
    }
}
