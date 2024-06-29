package com.kamacoder;

import java.util.Scanner;

/**
 * @author yt
 * 2024/6/29
 * 11. 共同祖先
 */
public class k_11_CommonAncestor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 记录组数
        int n;
        // 处理每组输入输出
        int a, b;
        while (in.hasNext()) {
            n = in.nextInt();
            int[] data = new int[22];
            // 读取每组数据
            while (n-- > 0) {
                data[in.nextInt()] = in.nextInt();
            }
            int highM = getHighLevel(data, 1);
            int highY = getHighLevel(data, 2);
            if (highY > highM) {
                // 说明小宇是小明的晚辈
                System.out.println("You are my younger");
            } else if (highY == highM) {
                // 说明小宇是小明的同辈
                System.out.println("You are my brother");
            } else {
                // 说明小宇是小明的长辈
                System.out.println("You are my elder");
            }
        }
    }
    // 输入编号 获取其长辈层级高度
    private static int getHighLevel(int[] data, int code) {
        int high = 0;
        while (data[code] != 0) {
            ++ high;
            code = data[code];
        }
        return high;
    }
}
