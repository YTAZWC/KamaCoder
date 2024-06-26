package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_8_LevelTheBlocks
 * @date 2024/6/26 21:19
 * @package com.kamacoder
 * @description 8. 摆平积木
 */
public class k_8_LevelTheBlocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int[] nums = new int[51];
        while (in.hasNext() && ((n = in.nextInt()) != 0)) {
            int sum = 0;
            int result = 0;
            for (int i = 0; i < n; ++ i) {
                nums[i] = in.nextInt();
                sum += nums[i];
            }
            int average = sum / n;
            for (int i = 0; i < n; ++ i) {
                result += Math.abs(nums[i] - average);
            }
            System.out.println(result/2);
            System.out.println();
        }
    }
}
