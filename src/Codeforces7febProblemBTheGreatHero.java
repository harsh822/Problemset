/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 07-02-2021
 *   Time: 20:41
 *   File: Codeforces7febProblemBTheGreatHero.java
 */

import java.util.Scanner;

public class Codeforces7febProblemBTheGreatHero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0) {
            long A = scan.nextLong();
            long B = scan.nextLong();
            int n = scan.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long sumOfAttackPowerOfAllMonsters = 0;
            long sumOfAllInitialValueOfALlMonsters = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                sumOfAttackPowerOfAllMonsters += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
                sumOfAllInitialValueOfALlMonsters += b[i];
            }
            for (int i = 0; i < n; i++) {
                B -= a[i];
                sumOfAllInitialValueOfALlMonsters -= A;
            }
            if (sumOfAllInitialValueOfALlMonsters == 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
