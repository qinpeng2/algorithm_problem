package com.github.qinpeng2.ap.nowcoder.huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 */
public class HexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String v = Integer.valueOf(s.substring(2, s.length()), 16).toString();
            System.out.println(v);
        }
    }
}
