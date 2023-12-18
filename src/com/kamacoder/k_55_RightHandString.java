package com.kamacoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class k_55_RightHandString {

    public static void main(String[] args) throws IOException {

        // 读取k
        int k = Reader.nextInt();
        // 读取字符串
        String s = Reader.nextLine();
        // 将字符串转化为字符数组
        char[] str = s.toCharArray();

        // 先反转整个字符串
        reverseString(str, 0, str.length-1);
        // 再反转原先的第二部分
        reverseString(str, 0, k-1);
        // 反转原先的第一部分
        reverseString(str, k, str.length-1);

        // 输出右旋转后的字符串
        PrintWriter out = new PrintWriter(System.out);
        out.println(new String(str));
        out.flush();    // 刷新快速输出流

    }
    // 相向双指针 实现字符串反转
    public static void reverseString(char[] str, int left, int right) {
        while (left < right) {
            str[left] ^= str[right];
            str[right] ^= str[left];
            str[left] ^= str[right];
            ++ left;
            -- right;
        }
    }

    class Reader {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static StringTokenizer tokenizer = new StringTokenizer("");
        static String nextLine() throws IOException {       // 读取下一行字符串
            return reader.readLine();
        }
        static String next() throws IOException {      // 读取下一个单词
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
        static int nextInt() throws IOException {       // 读取一个Int型整数值
            return Integer.parseInt(next());
        }

    }

}
