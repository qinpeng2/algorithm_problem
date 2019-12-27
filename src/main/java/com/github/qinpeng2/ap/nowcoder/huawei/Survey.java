package com.github.qinpeng2.ap.nowcoder.huawei;

import java.util.Scanner;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。
 * 然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
 * 请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 * <p>
 * <p>
 * Input Param
 * n               输入随机数的个数
 * inputArray      n个随机整数组成的数组
 * <p>
 * <p>
 * Return Value
 * OutputArray    输出处理后的随机整数
 * <p>
 * <p>
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
 */
public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int count = scanner.nextInt();

            int[] box = new int[1000];

            for (int i = 0; i < count; i++) {
                int value = scanner.nextInt();
                box[value] = value;
            }

            for (int i = 0; i < box.length; i++) {
                int value = box[i];
                if (value > 0) {
                    System.out.println(value);
                }
            }
        }
    }
}
