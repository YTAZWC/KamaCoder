package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_2_AAndBQuestionII
 * @date 2024/6/24 9:13
 * @package com.kamacoder
 * @description 2. A+B问题II
 */
public class k_2_AAndBQuestionII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int a, b;
        while (in.hasNext()) {
            n = in.nextInt();
            for (int i = 0; i < n; ++ i) {
                a = in.nextInt();
                b = in.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
