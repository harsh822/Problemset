/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 03-02-2021
 *   Time: 21:23
 *   File: WordCapitalization.java
 */

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        boolean b;
        String str = scan.next();
        b = Character.isUpperCase(str.charAt(0));
        if (b) {
            System.out.println(str);
        }
        else {
            System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
        }
    }
}
