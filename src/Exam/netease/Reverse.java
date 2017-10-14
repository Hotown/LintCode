package Exam.netease;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int n = scanner.nextInt();

        StringBuffer old = new StringBuffer();
        old.append(String.valueOf(n));

        res = Integer.valueOf(old.toString()) + Integer.valueOf(old.reverse().toString());

        System.out.println(res);
    }
}
