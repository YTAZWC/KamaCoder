package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_4_AAndBQuestionIV
 * @date 2024/6/24 10:07
 * @package com.kamacoder
 * @description 4. A+B问题IV
 */
public class k_4_AAndBQuestionIV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        while (in.hasNext() && (n = in.nextInt()) != 0) {
            sum = 0;
            while (n-- > 0) {
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
    }
}
