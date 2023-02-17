package anudeep_JAVA;

import java.util.Scanner;

public class classTest_2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		System.out.println("enter number");
		int num = sc.nextInt();
		while (num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("counts of digits in num: " + count);
		}
}
