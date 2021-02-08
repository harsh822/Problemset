/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 30-01-2021
 *   Time: 21:45
 *   File: EvenDifferences.java
 */

import java.util.Scanner;

public class EvenDifferences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int f = 0;
        while(t-->0) {
            int n = scan.nextInt();
            int oddNumbers = 0;
            int evenNumbers = 0;
            int e = 0;
            int o = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (a[i]%2==0) {
                    evenNumbers++;
                }
                else {
                    oddNumbers++;
                }
            }
            if (evenNumbers<oddNumbers) {
                for (int i = 0; i < n; i++) {
                    if (a[i]%2==0) {
                        f++;
                    }
                }
                System.out.println(e);
            }
            else {
                for (int i = 0; i < n; i++) {
                    if (a[i]%2!=0) {
                        o++;
                    }
                }
                System.out.println(o);
            }
        }
    }
}
