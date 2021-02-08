/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 31-01-2021
 *   Time: 22:09
 *   File: ProblemSet31jan.java
 */

import java.util.*;

public class ProblemSet31jan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int c =0;
        boolean allNonZero = true;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            if (a[i] == 0) {
                allNonZero = false;
            }
        }
        if (allNonZero == false) {
            System.out.println(0);
        }
        else {
            for (int i = 0; i < n; i++) {
                if (a[i] >= a[k-1]) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
