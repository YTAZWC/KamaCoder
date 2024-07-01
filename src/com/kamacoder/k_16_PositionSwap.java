package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_16_PositionSwap
 * @date 2024/7/1 22:38
 * @package com.kamacoder
 * @description 16. 位置互换
 */
public class k_16_PositionSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String number;
        while (in.hasNext()) {
            number = in.nextLine();
            n = Integer.parseInt(number);
            while (n-- > 0) {
                String evenStr = in.nextLine();
                System.out.println(positionSwap(evenStr));
            }
        }
    }
    private static String positionSwap(String even) {
        StringBuilder result = new StringBuilder();
        int len = even.length();
        for (int i = 0; i < len-1; i += 2) {
            result.append(even.charAt(i+1)).append(even.charAt(i));
        }
        return result.toString();
    }
}
