/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 06-02-2021
 *   Time: 21:16
 *   File: CodechefLongFebMaximiseFunction.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class CodechefLongFebMaximiseFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            System.out.println(2*Math.abs(a[0]-a[n-1]));
        }
    }
}
