package pta;

import java.util.Scanner;

public class 数字转转转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1]; // 创建数组 a，存每个数字要做几次操作
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int result = addDigits(i, a[i]);
            System.out.print(result);
            if (i < n) System.out.print(" ");
        }
        System.out.println();
    }

    public static int addDigits(int num, int times) {
        for (int i = 0; i < times; i++) {
            if (num < 10) break;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
