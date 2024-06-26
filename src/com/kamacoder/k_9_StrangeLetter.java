package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_9_StrangeLetter
 * @date 2024/6/26 21:41
 * @package com.kamacoder
 * @description 9. 奇怪的信
 */
public class k_9_StrangeLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            n = in.nextInt();
            System.out.println(evenSum(n));
            System.out.println();
        }
    }
    private static int evenSum(int n) {
        int result = 0;
        while (n > 0) {
            if (n % 10 % 2 == 0) {
                result += n % 10;
            }
            n /= 10;
        }
        return result;
    }
}
