/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 05-02-2021
 *   Time: 22:03
 *   File: CodechefHighestDriver.java
 */

import java.util.Scanner;

public class CodechefHighestDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int g = 1;
        for (int i = 1; i <= 10; i++) {
            if (n%i==0) {
                if (i>g) {
                    g = i;
                }
            }
        }
        System.out.println(g);
    }
}
