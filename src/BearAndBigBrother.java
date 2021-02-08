/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 04-02-2021
 *   Time: 22:10
 *   File: BearAndBigBrother.java
 */

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int noOfYears = 1;
        for (int i = 0; i < 10; i++) {
            if (a*3<=b*2) {
                noOfYears++;
            }
            a = a*3;
            b = b*2;
        }
        System.out.println(noOfYears);
    }
}
