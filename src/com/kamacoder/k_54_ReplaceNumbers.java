package com.kamacoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 54. 替换数字（第八期模拟笔试）
 * @author 花木凋零成兰
 *
 */
public class k_54_ReplaceNumbers {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        String s = Reader.nextLine();  // 读取字符串
        int n = s.length();     // 字符串的长度
        // StringBuilder ans = new StringBuilder();  // 返回结果字符串
        int count = 0;      // 记录数字字符个数

        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {   // 若为数字字符 则计数
                ++ count;
            }
        }
        int len = n + count*5;
        char[] ans = new char[len];
        int index = 0;
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {   // 若为数字字符 则替换为number
                ans[index++] = 'n';
                ans[index++] = 'u';
                ans[index++] = 'm';
                ans[index++] = 'b';
                ans[index++] = 'e';
                ans[index++] = 'r';
            } else {
                ans[index++] = ch;
            }
        }
        // System.out.println(new String(ans));

        PrintWriter out = new PrintWriter(System.out);  // 快速输出
        out.println(new String(ans));
        out.flush();
    }

    /**
     * 快读
     */
    class Reader {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static StringTokenizer tokenizer = new StringTokenizer("");
        static String nextLine() throws IOException {// 读取下一行字符串
            return reader.readLine();
        }
        static String next() throws IOException {   // 读取下一个字符串
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static int nextInt() throws IOException {// 读取下一个int型数值
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {// 读取下一个double型数值
            return Double.parseDouble(next());
        }
    }

}

