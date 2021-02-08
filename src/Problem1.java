/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 29-01-2021
 *   Time: 21:00
 *   File: Problem1.java
 */

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = 5;
        while(t-->0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            if(x > y && x > z)
            {
                if (y+z==x) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else if(y > z)
            {
                if (x+z==y) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else
            {
                if (x+y==z) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
