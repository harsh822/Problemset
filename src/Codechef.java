/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 30-01-2021
 *   Time: 22:18
 *   File: Codechef.java
 */

import java.util.Scanner;
import java.lang.Math;
public class Codechef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int noOfSolvedProblems = 0;
            int bot = 0;
            Boolean isRejected = false;
            Boolean isTooSlow = false;
            Boolean isBot = false;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (a[i]!=-1) {
                    noOfSolvedProblems++;
                }
                if (a[i] > k) {
                    isTooSlow = true;
                }
                if (a[i] == 0 || a[i] == 1) {
                    bot++;
                }
            }
            if (noOfSolvedProblems<Math.ceil((double) n/2)) {
                System.out.println("Rejected");
                isRejected = true;
            }
            if (isRejected == false && isTooSlow == true) {
                System.out.println("Too Slow");
            }
            if (isRejected == false && isTooSlow == false && bot == n) {
                System.out.println("Bot");
                isBot = true;
            }
            if (isRejected == false && isTooSlow == false && isBot == false) {
                System.out.println("Accepted");
            }
        }
    }
}
