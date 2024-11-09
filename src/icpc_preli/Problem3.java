package icpc_preli;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 1; a <= t; a++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int r = 0;
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = k / x;
                r += z;
            }
            System.out.println("Case " + a + ": " + r);
        }
    }
}
