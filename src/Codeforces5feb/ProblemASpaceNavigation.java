/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 05-02-2021
 *   Time: 20:19
 *   File: ProblemASpaceNavigation.java
 */

package Codeforces5feb;

import java.util.Scanner;

public class ProblemASpaceNavigation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0) {
            int px = scan.nextInt();
            int py = scan.nextInt();
            int x = 0;
            int y = 0;
            int u = 0;
            int d = 0;
            int r = 0;
            int l = 0;
            scan.nextLine();
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'U') {
                    y = y+1;
                    u = u+1;
                }
                else if (str.charAt(i) == 'D') {
                    y = y-1;
                    d = d-1;
                }
                else if (str.charAt(i) == 'R') {
                    x = x+1;
                    r = r+1;
                }
                if (str.charAt(i) == 'L') {
                    x = x-1;
                    l = l-1;
                }
            }
            if (x == px && y == py) {
                System.out.println("Yes");
            }
            else if (px>0 && py>0) {
                if (r == px && u == py) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
            else if (px>0 && py<0) {
                if (r == px && d == py) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
            else if (px<0 && py>0) {
                if (l == px && u == py) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
            else if (px<0 && py<0) {
                if (l == px && d == py) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        }
    }
}
