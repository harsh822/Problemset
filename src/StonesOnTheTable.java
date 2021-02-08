/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 03-02-2021
 *   Time: 21:37
 *   File: StonesOnTheTable.java
 */

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c =0;
        String[] str = new String[n];
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = scan.nextLine();
        }
        for (int i = 0; i < n-1; i++) {
            if (str[i].equals(str[i+1])) {
                c++;
            }
        }
        System.out.println(c);
    }
}
