/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 06-02-2021
 *   Time: 23:14
 *   File: illyAndBankAccount.java
 */

import java.util.Scanner;

public class illyAndBankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n>0) {
            System.out.println(n);
        }
        else {
            System.out.println(Math.max(((n/100)*10+n%10),(n/10)));
        }
    }
}
