package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_15_MysteriousCharacters
 * @date 2024/6/30 12:55
 * @package com.kamacoder
 * @description 15. 神秘字符
 */
public class k_15_MysteriousCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 读取测试数据组数
        String number = in.nextLine();
        int n = Integer.parseInt(number);
        while (n-- > 0) {
            // 读取输入的测试数据
            String a = in.nextLine();
//            System.out.println(a);
            String b = in.nextLine();
//            System.out.println(b);
            System.out.println(middleInsertStr(a, b));
        }
    }
    private static String middleInsertStr(String a, String b) {
        StringBuilder result = new StringBuilder();
        int len = a.length();
        int middle = len/2;
        for (int i = 0; i < len; ++ i) {
            if (i == middle) {
                result.append(b);
            }
            result.append(a.charAt(i));
        }
        return result.toString();
    }
}
