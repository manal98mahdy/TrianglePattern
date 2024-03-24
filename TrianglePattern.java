package day2;

import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {

//        int numRows =5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the isosceles triangle: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
