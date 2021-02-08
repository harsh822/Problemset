/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 01-02-2021
 *   Time: 21:58
 *   File: Bit.java
 */

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        while(n-->0) {
            String str = scan.next();
            if (str.charAt(1) == '+') {
                c++;
            }
            else {
                c--;
            }
        }
        System.out.println(c);
    }
}
