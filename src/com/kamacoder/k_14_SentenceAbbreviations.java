package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_14_SentenceAbbreviations
 * @date 2024/6/30 12:26
 * @package com.kamacoder
 * @description 14.句子缩写
 */
public class k_14_SentenceAbbreviations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 读取测试数据组数
        String number = in.nextLine();
        int n = Integer.parseInt(number);
        while (n-- > 0) {
            StringBuilder result = new StringBuilder();
            // 读取一行输入
            String str = in.nextLine();
//            System.out.println(str);
            // 通过空格进行切割
            String[] words = str.split("\\s+");
            // 测试切割效果
//            System.out.println(Arrays.deepToString(words));
            // 遍历单词
            for (String word : words) {
                result.append(word.charAt(0));
            }
            System.out.println(result.toString().toUpperCase());
        }
    }
}
