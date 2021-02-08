/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 04-02-2021
 *   Time: 21:49
 *   File: SoldierAndBananas.java
 */

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int w = scan.nextInt();
        int borrow = 0;
        int total =0;
        for (int i = 1; i <= w; i++) {
            total += i*k;
        }
        borrow = total - n;
        if (total<=n) {
            System.out.println(0);
        }
        else {
            System.out.println(borrow);
        }
    }
}
