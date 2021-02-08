/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 07-02-2021
 *   Time: 20:15
 *   File: Codeforces7febProblemA.java
 */

import java.util.Scanner;

public class Codeforces7febProblemA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0) {
            String str = scan.next();
            char[] stringChar = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (i%2==0) {
                    if (str.charAt(i) != 'a') {
                        stringChar[i] = 'a';
                    }
                    else {
                        stringChar[i] = 'b';
                    }
                }
                else {
                    if (str.charAt(i) != 'z') {
                        stringChar[i] = 'z';
                    }
                    else {
                        stringChar[i] = 'y';
                    }
                }
            }
            str = String.valueOf(stringChar);
            System.out.println(str);
        }
    }
}
