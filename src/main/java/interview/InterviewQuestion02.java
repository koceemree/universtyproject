package interview;

import java.util.List;
import java.util.Scanner;

public class InterviewQuestion02 extends Deneme{

	//Write a Java Program to swap two numbers
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		


	}
	public static List<Deneme> soru(){
		System.out.println("//Write a Java Program to swap two numbers");
		System.out.println("Cevabı gormek için 1 tıklayın.");
		int num = scan.nextInt();
		if(num==3){
			cevap();

		}
		return soru();
	}
	public static void cevap(){
		System.out.println("\t\tScanner scan = new Scanner(System.in);\n" +
				"\t\tSystem.out.println(\"Enter 2 numbers to swap\");\n" +
				"\t\tdouble n1 = scan.nextDouble();\n" +
				"\t\tdouble n2 = scan.nextDouble();\n" +
				"\n" +
				"\t\tSystem.out.println(\"Before swapping: \" + n1 + \" - \" + n2);\n" +
				"\n" +
				"\t\t//1.Way: Use 3rd variable\n" +
				"\t\tdouble temp = n1;\n" +
				"\t\tn1 = n2;\n" +
				"\t\tn2 = temp;\n" +
				"\t\tSystem.out.println(\"After swapping: \" + n1 + \" - \" + n2);\n" +
				"\n" +
				"\t\t//2.Way: Do not use 3rd variable\n" +
				"\t\tn1 = n1 + n2;\n" +
				"\t\tn2 = n1 - n2;\n" +
				"\t\tn1 = n1 - n2;\n" +
				"\t\tSystem.out.println(\"After swapping: \" + n1 + \" - \" + n2);");
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to swap");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();

		System.out.println("Before swapping: " + n1 + " - " + n2);

		//1.Way: Use 3rd variable
		double temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After swapping: " + n1 + " - " + n2);

		//2.Way: Do not use 3rd variable
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After swapping: " + n1 + " - " + n2);
	}

}
