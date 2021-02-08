/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 04-02-2021
 *   Time: 21:42
 *   File: BoyOrGirl.java
 */

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
        }
    }
}
