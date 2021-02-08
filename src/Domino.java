/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 01-02-2021
 *   Time: 21:45
 *   File: Domino.java
 */

import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int t = m*n/2;
        System.out.println(t);
    }
}
