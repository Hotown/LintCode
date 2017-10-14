package Exam.netease;

import java.util.Scanner;

public class MagicCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
//        ArrayList<String> res = new ArrayList<>();
        StringBuffer res = new StringBuffer();
        while (n != 0) {
            if (n % 2 == 0) {
                n = (n - 2) / 2;
//                res.add("2");
                res.append('2');
            } else {
                n = (n - 1) / 2;
//                res.add("1");
                res.append('1');
            }
        }
        for (int i = res.length() - 1; i >= 0; i--) {
            System.out.print(res.charAt(i));
        }
    }
}
