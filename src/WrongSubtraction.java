/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 04-02-2021
 *   Time: 22:28
 *   File: WrongSubtraction.java
 */

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            if (n%10!=0) {
                n = n-1;
            }
            else {
                n = n/10;
            }
        }
        System.out.println(n);
    }
}
