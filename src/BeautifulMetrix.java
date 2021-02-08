/*   Created by IntelliJ IDEA.
 *   Author: Harsh Gautam (harsh822)
 *   Date: 01-02-2021
 *   Time: 22:41
 *   File: BeautifulMetrix.java
 */

import java.util.Scanner;

public class BeautifulMetrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int rows = 0;
        int columns = 0;
        int r = 0;
        int c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scan.nextInt();
                if (matrix[i][j] == 1) {
                    rows = i;
                    columns = j;
                }
            }
        }
        if (rows == 2 && columns == 2) {
            System.out.println(0);
        }
        else if (rows<2) {
            for (int i = 0; i < 5; i++) {
                if (rows!=2) {
                    rows++;
                    r++;
                }

            }
        }
    }
}
