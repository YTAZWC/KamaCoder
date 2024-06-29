package com.kamacoder.week_23;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author 花木凋零成兰
 * @title Main_A
 * @date 2024/6/27 20:01
 * @package com.kamacoder.week_23
 * @description 获取连通的相邻节点列表
 */
public class Main_A {
    public static void main(String[] args) {
        Read read = new Read(System.in);
//        Scanner in = new Scanner(System.in);
        int am;
        List<Integer> ids = new ArrayList<>();
        // 获取节点A的端口数
        am = read.nextInt();
        // 读取节点A的端口对应的VLAN_id
        for (int i = 0; i < am; ++ i) {
            ids.add(read.nextInt());
        }
        // 获取节点A附近的节点
        int n = read.nextInt();
        List<Long> result = new ArrayList<>();
        // 读取附近节点信息
        for (int i = 0; i < n; ++ i) {
            // 节点tb标识
            Long tb = read.nextLong();
            // 节点端口数
            int tbCount = read.nextInt();
            boolean flag = true;
            int[] tbIds = new int[tbCount+1];
            for (int j = 0; j < tbCount; ++ j) {
                int id = read.nextInt();
                if (flag && ids.contains(id)) {
                    flag = false;
                    result.add(tb);
                }
            }
        }
        result.sort(Comparator.comparingLong(a -> a));
        int len = result.size();
        for (int i = 0; i < len; ++ i) {
            System.out.printf("" + result.get(i));
            if (i != len-1) {
                System.out.print(" ");
            }
        }
    }
}
class Read {//自定义快读 Read

    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public Read(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return str;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public Double nextDouble() {
        return Double.parseDouble(next());
    }

    public BigInteger nextBigInteger() {
        return new BigInteger(next());
    }
}