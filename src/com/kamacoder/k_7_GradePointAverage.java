package com.kamacoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yt
 * 2024/6/25
 * 7. 平均绩点
 */
public class k_7_GradePointAverage {
    public static void main(String[] args) {
        // 课程等级,以及对应的分数
        Map<String, Integer> pointByGrade = new HashMap<>();
        pointByGrade.put("A", 4);
        pointByGrade.put("B", 3);
        pointByGrade.put("C", 2);
        pointByGrade.put("D", 1);
        pointByGrade.put("F", 0);
        Scanner in = new Scanner(System.in);
        String inStr;
        while (in.hasNext()) {
            // 读取一行
            inStr = in.nextLine();
            // 使用空格进行分割
            String[] grade = inStr.split(" ");
            // 统计所有绩点
            double sum = 0;
            // 判断输入是否合法, 初始状态为合法
            boolean flag = true;
            for (String s : grade) {
                if (pointByGrade.containsKey(s)) {
                    sum += pointByGrade.get(s);
                } else {
                    // 输入存在不合法，退出计算
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Unknown");
            } else {
                // 输入合法，输出对应平均绩点
                System.out.printf("%.2f\n", sum/grade.length);
            }
        }

    }
}
