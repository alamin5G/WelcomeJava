package icpc_preli;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 1; a <= t; a++) {
            int n = sc.nextInt();
            long k = sc.nextInt();
            int r = 0;
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                long z = k / x;
                r += (int) z;
            }
            System.out.println("Case " + a + ": " + r);
        }
    }
}
