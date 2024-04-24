package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_1_AAndBQuestionI
 * @date 2024/4/24 23:26
 * @package com.kamacoder
 * @description 1. A+B问题I
 */
public class k_1_AAndBQuestionI {
    // 学习循环输入 一堆数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 判断是否还有输入的a,b对
        while (in.hasNext()) {
            // 读取A
            int a = in.nextInt();
            // 读取B
            int b = in.nextInt();
            // 测试输入
            // System.out.println("a: " + a + " b: " + b);
            System.out.println(aSumB(a, b));
        }
    }
    public static int aSumB(int a, int b) {
        return a+b;
    }
}
