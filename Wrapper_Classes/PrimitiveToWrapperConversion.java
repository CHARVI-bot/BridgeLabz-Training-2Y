package Wrapper_Classes;

import java.util.Scanner;

public class PrimitiveToWrapperConversion {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			System.out.println("The primitive form: "+num);
			System.out.println("The object form: "+Integer.valueOf(num));
			sc.close();
		}
}