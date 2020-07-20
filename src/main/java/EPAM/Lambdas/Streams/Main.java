package EPAM.Lambdas.Streams;

import java.util.*;
import EPAM.Lambdas.Streams.Util.*;

class Main {
	static AverageInt a = new AverageInt();
	static PalindromeStr p = new PalindromeStr();
	static SubStr3a s = new SubStr3a();
	static Scanner Scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Select one of the following Operations to perfrom");
		System.out.println("1. Find the Average of a list of given numbers");
		System.out.println("2. return a substring with 'a' from a given String");
		System.out.println("3. check Palindrome in a given list of Strings");
		System.out.println("==========   ==========   ==========   ==========");
		System.out.println("Enter your choice:  ");
		int choice = Scan.nextInt();
		switch (choice) {
			case 1:
				System.out.println("Enter Any Character to Stop taking inputs />");
				ArrayList<Integer> intList = new ArrayList<Integer>();
				while (Scan.hasNextInt()) {
					int i = Scan.nextInt();
					intList.add(i);
				}
				System.out.println("The Average of the given list of integers is: " + a.averageOfIntegers(intList));
				break;
			case 2:
				ArrayList<String> srtList = new ArrayList<String>();
				System.out.println("Enter Number of Strings in List: ");
				int n = Scan.nextInt();
				for (int j = 0; j <= n; j++) {
					String i = Scan.nextLine();
					srtList.add(i);
				}
				System.out.println("strings that start with the letter 'a' and have exactly 3 letters are: "
						+ s.filter3astr(srtList));
				break;
			case 3:
				ArrayList<String> Liststr = new ArrayList<String>();
				System.out.println("Enter Number of Strings in List: ");
				int m = Scan.nextInt();
				for (int j = 0; j <= m; j++) {
					String i = Scan.nextLine();
					Liststr.add(i);
				}
				System.out.println(" Palindromes in the given list of Strings are: " + p.filterpalindromes(Liststr));
				break;
			default:
				System.out.println("Select any option between 1-3");
		}
	}
}