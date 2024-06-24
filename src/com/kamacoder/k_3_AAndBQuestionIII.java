package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_3_AAndBQuestionIII
 * @date 2024/6/24 9:44
 * @package com.kamacoder
 * @description 3. A+B问题III
 */
public class k_3_AAndBQuestionIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while (a != 0 && b != 0) {
            System.out.println(a + b);
            a = in.nextInt();
            b = in.nextInt();
        }
    }
}
