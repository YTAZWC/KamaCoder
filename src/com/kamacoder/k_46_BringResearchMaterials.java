package com.kamacoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 46. 携带研究材料（第六期模拟笔试）
 * @author 花木凋零成兰
 * @date 2024/4/6 11:24
 */
public class k_46_BringResearchMaterials {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();   // 研究材料种类
        int n = in.nextInt();   // 行李空间

        int[] a = new int[m];   // 每种研究材料所占空间
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[m];   // 每种研究材料的价值
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        // 检验输入是否有问题
//        System.out.println(m);
//        System.out.println(n);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

        // 输出结果
        System.out.println(BringResearchMaterials(m, n, a, b));

    }

    /**
     * 动态规划
     * @param m 材料种类数
     * @param n 空间大小
     * @param spaces    每种材料所占空间
     * @param values    每种材料所占价值
     * @return
     */
//    private static int BringResearchMaterials(int m, int n, int[] spaces, int[] values) {
//
//        // 1. dp数组的含义：dp[i][j] 表示任取[0,i]的物品 放入容量为j的背包中 的最大价值
//        int[][] dp = new int[m+1][n+1];
//        // 2. dp数组的递推公式
//        // 不放物品i时 dp[i][j] = dp[i-1][j]
//        // 放物品i时 dp[i][j] = dp[i-1][j-values[i]] + values[i]
//        // 所以递推公式为： dp[i][j] = max(dp[i-1][j], dp[i-1][j-values[i]] + values[i])
//        // 3. dp数组的初始化
//        // 背包容量为0时 即j=0 此时背包无法放入研究材料 dp[i][0]均为0
//        // 对于只有物品0时 判断其是否为可以放入背包 可以则放入dp[0][j]=values[i] 不可以则dp[0][j]=0
//        for (int j = 1; j <= n; ++ j) {
//            if (j >= spaces[0]) {
//                dp[0][j] = values[0];
//            }
//        }
//        // 4. dp数组的遍历顺序
//        // 根据dp数组定义 第一层循环遍历物品 从左往右
//        // 第二层循环则 背包容量 从小到大
//        for (int i = 1; i < m; ++ i) {
//            for (int j = 1; j <= n; ++j) {
//                if (j >= spaces[i]) {
//                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-spaces[i]] + values[i]);
//                } else dp[i][j] = dp[i-1][j];
//            }
//        }
//
//        // 5. 打印dp数组
//        // System.out.println(Arrays.deepToString(dp));
//        return dp[m-1][n];
//    }

    /**
     * 动态规划 —— 滚动数组
     * @param m 材料种类数
     * @param n 空间大小
     * @param spaces    每种材料所占空间
     * @param values    每种材料所占价值
     * @return
     */
    private static int BringResearchMaterials(int m, int n, int[] spaces, int[] values) {

        // 1. dp数组的含义：dp[j] 表示任取[0,i]的物品 放入容量为j的背包中 的最大价值
        int[] dp = new int[n+1];
        // 2. dp数组的递推公式
        // 不放物品i时 dp[j] = dp[j]
        // 放物品i时 dp[j] = dp[j-values[i]] + values[i]
        // 所以递推公式为： dp[j] = max(dp[j], dp[j-values[i]] + values[i])
        // 3. dp数组的初始化
        // 背包容量为0时 即j=0 此时背包无法放入研究材料 dp[0]为0
        dp[0] = 0;
        // 4. dp数组的遍历顺序
        // 根据dp数组定义 第一层循环遍历物品 从左往右
        // 第二层循环则 背包容量 从大到小
        for (int i = 0; i < m; ++ i) {
            for (int j = n; j >= 1; --j) {
                if (j >= spaces[i]) {
                    dp[j] = Math.max(dp[j], dp[j - spaces[i]] + values[i]);
                }
            }
        }

        // 5. 打印dp数组
        // System.out.println(Arrays.deepToString(dp));
        return dp[n];
    }
}
