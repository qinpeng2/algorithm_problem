package com.github.qinpeng2.ap.nowcoder.huawei;

import java.util.*;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/67df1d7889cf4c529576383c2e647c48
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 * 处理:
 * 1.记录最多8条错误记录，对相同的错误记录(即文件名称和行号完全匹配)只记录一条，错误计数增加；(文件所在的目录不同，文件名和行号相同也要合并)
 * 2.超过16个字符的文件名称，只记录文件的最后有效16个字符；(如果文件名不同，而只是文件名的后16个字符和行号相同，也不要合并)
 * 3.输入的文件可能带路径，记录文件名称不能带路径
 *
 * 输入描述:
 * 一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
 *     文件路径为windows格式
 *     如：E:\V1R2\product\fpgadrive.c 1325
 *
 * 输出描述:
 * 将所有的记录统计并将结果输出，格式：文件名代码行数数目，一个空格隔开，如: fpgadrive.c 1325 1
 *     结果根据数目从多到少排序，数目相同的情况下，按照输入第一次出现顺序排序。
 *     如果超过8条记录，则只输出前8条记录.
 *     如果文件名的长度超过16个字符，则只输出后16个字符
 *
 * Input: E:\V1R2\product\fpgadrive.c 1325
 * Output: fpgadrive.c 1325 1
 */
// TODO need to do test
public class SimpleErrorLog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] source = line.split(",");

            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> scores = new ArrayList<>();
            List<Integer> minList = new ArrayList<>();

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < source.length; i++) {
                Integer score = Integer.parseInt(source[i]);
                map.put(i, score);
                scores.add(score);
                if (score < min) {
                    min = score;
                    minList = new ArrayList<>(i);
                }
                if (score == min) {
                    minList.add(i);
                }
            }

            List result = new ArrayList();
            for (int minIndex : minList) {
                int[] patch = new int[source.length];
                Integer minScore = scores.get(minIndex);
                patch[minIndex] = 1;

                int previous = minScore;
                for (int i = minIndex + 1; i < scores.size(); i++) {
                    int nextScore = scores.get(i);
                    if (nextScore == previous) {
                        patch[i] = patch[i - 1] - 1;
                    }
                    if (nextScore > previous) {
                        patch[i] = patch[i - 1] + 1;
                    }
                    if (nextScore < previous) {
                        patch[i] = 1;
                    }
                    previous = nextScore;
                }

                int previous2 = minScore;
                for (int i = minIndex - 1; i >= 0; i--) {
                    int nextScore = scores.get(i);
                    if (nextScore == previous2) {
                        patch[i] = patch[i+1] - 1;
                    }
                    if (nextScore > previous2) {
                        patch[i] = patch[i + 1] + 1;
                    }
                    if (nextScore < previous2) {
                        patch[i] = 1;
                    }
                    previous2 = nextScore;
                }

                result.add(patch);
            }

            int[] all = new int[source.length];
            for (Object o : result) {
                int[] patch = (int[]) o;
                int total = 0;
                for (int i = 0; i < patch.length; i++) {
                    int count = patch[i];
                    if (count > all[i]) {
                        all[i] = count;
                    }
                }
            }

            int total = 0;
            for (int i = 0; i < all.length; i++) {
                total += all[i];
            }
            System.out.println(total);
        }

    }
}
