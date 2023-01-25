package interview;

import java.util.Scanner;

public class InterviewQuestion03 extends Deneme{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		


	}

	public static void soru(){
		System.out.println("//Write a Java Program to reverse a string");
		System.out.println("Cevabı gormek için 1 tıklayın.");
		int num = scan.nextInt();
		if(num==1){
			cevap();

		}
	}
	public static void cevap(){
		System.out.println("" +"\tSystem.out.println(\"How many fibonacci number do you want to see?\");\n" +
						"\t\tint number = scan.nextInt();\n" +
						"\t\tfibonacci(number);\n" +
						"        scan.close();"+
				"\t\tint fibo1 = 1; \n" +
				"\t\tint fibo2 = 1; \n" +
				"\t\tint fibonacci = 0;\n" +
				"\t\tSystem.out.print(fibo1 + \" \");\n" +
				"\t\tSystem.out.print(fibo2 + \" \");\n" +
				"\t\t\n" +
				"\t\tfor (int i = 1; i < number-1; i++) {\n" +
				"\t\t\tfibonacci = fibo1 + fibo2;\n" +
				"\t\t\tfibo1 = fibo2;\n" +
				"\t\t\tfibo2 = fibonacci;\n" +
				"\t\t\tSystem.out.print(fibonacci + \" \");");
	}
	public static void fibonacci(int number) {
		int fibo1 = 1; 
		int fibo2 = 1; 
		int fibonacci = 0;
		System.out.print(fibo1 + " ");
		System.out.print(fibo2 + " ");
		
		for (int i = 1; i < number-1; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			System.out.print(fibonacci + " ");
		}

	}

}
