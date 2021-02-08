/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 01-02-2021
 *   Time: 22:12
 *   File: PetyaAndStrings.java
 */

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(0);
        }
        else if (str1.compareToIgnoreCase(str2)<=-1){
            System.out.println(-1);
        }
        else
        {
            System.out.println(1);
        }
    }

}
