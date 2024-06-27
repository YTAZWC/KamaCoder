package com.kamacoder;

import java.util.Scanner;

/**
 * @author yt
 * 2024/6/27
 * 10.运营商活动
 */
public class k_10_OperatorActivities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k, m;
        while (in.hasNext() && (m = in.nextInt()) != 0 && (k = in.nextInt()) != 0) {
            System.out.println(calculateCallCharges(m, k));
        }
    }
    private static int calculateCallCharges(int m, int k) {
        int result = m + m/k;
        do {
            // 计算下一轮参与奖励规则的天数
            m = m/k + m%k;
            // 计算得出奖励天数
            result += m/k;
        } while (m / k != 0);
        return result;
    }
}
