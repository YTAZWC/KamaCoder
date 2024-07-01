package com.kamacoder;

import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_17_PoppingLegality
 * @date 2024/7/1 23:08
 * @package com.kamacoder
 * @description 17. 出栈合法性
 */
public class k_17_PoppingLegality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext() && (n = in.nextInt()) != 0) {
            int[] nums = new int[n+1];
            for (int i = 0; i < n; ++ i) {
                nums[i] = in.nextInt();
            }
            System.out.println(judgeLegality(n, nums));
        }
    }
    private static String judgeLegality(int n, int[] nums) {
        // 记录下一个出栈的 小数
        int left = nums[0]-1;
        // 记录下一个出栈的 大数
        int right = nums[0] + 1;
        for (int i = 1; i < n; ++ i) {
            if (left < 0) {
                return "No";
            }
            if (nums[i] == left || nums[i] == right) {
                // 为其一的合法输入
                if (nums[i] == right) {
                    // 出栈为 大数 则更新下次所可能出栈的数
                    right = nums[i] + 1;
                } else if (nums[i] == left) {
                    left = nums[i] - 1;
                }
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
