/**
 * 
 */
package cs141.jlhenry2;

import java.util.Scanner;

/**
 * @author jlhenry2
 *
 */
public class AvgOfNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int num;
		float avg = 0;
		int count = 0;
		int total = 0;
		
		//all the doubles and variables!!!
		
		System.out.println("Please enter 10 positive integars or if you would like to quit early enter a negative number");
		
		while (count < 10) {
            System.out.print("Enter a number: ");
             num = scnr.nextInt();

            if (num < 0) {
                break;
            }

            if (num > 0) {
                count++;
                total += num;
            }
        }
		
		avg = total / count;
		
		System.out.println("Number of positive integers: " + count);
		System.out.println("Total of positive integers: " + total);
		System.out.println("Average of positive integers: " + avg);

	}

}
