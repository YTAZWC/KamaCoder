package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_6_AAndBQuestionVIII
 * @date 2024/6/24 13:56
 * @package com.kamacoder
 * @description 6.A+B问题VIII
 */
public class k_6_AAndBQuestionVIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int m;
        int sum = 0;
        while (in.hasNext()) {
            n = in.nextInt();
            for (int i = 0; i < n; ++i) {
                m = in.nextInt();
                sum = 0;
                while (m-- > 0) {
                    sum += in.nextInt();
                }
                System.out.println(sum);
                if (i != n-1) {
                    System.out.println();
                }
            }
        }
    }
}
