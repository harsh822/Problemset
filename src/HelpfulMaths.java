/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 02-02-2021
 *   Time: 22:33
 *   File: HelpfulMaths.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // convert input string to char array
        String str = scan.next();
        char temp = 0;
        char[] chars = str.toCharArray();
        for(int i=0; i < chars.length; i+=2) {
            for(int j=0; j < chars.length; j+=2) {
                if(chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        str = String.valueOf(chars);
        System.out.println(str);
    }
}
