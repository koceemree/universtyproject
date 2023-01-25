package interview;

import java.util.Scanner;

public class InterviewQuestion01 extends Deneme implements Qestion{
	static Scanner scan = new Scanner(System.in);



	public static void soru(){
		System.out.println("//Write a Java Program to reverse a string");
		System.out.println("Cevabı gormek için 1 tıklayın.");
		int num = scan.nextInt();
		if(num==1){
		cevap();

		}
	}
	public static void cevap(){
		System.out.println("System.out.println(\"Enter a String to reverse\");\n" +
				"\t\tString str1 = scan.nextLine();\n" +
				"\n" +
				"\t\t//1.Way: By using StringBuilder()\n" +
				"\t\tStringBuilder strB = new StringBuilder();\n" +
				"\t\tstrB.append(str);\n" +
				"\t\tSystem.out.println(strB.reverse());\n" +
				"\n" +
				"\t\tString revStr1= \"\";\n" +
				"\t\t//2.Way: By using String Class\n" +
				"\t\tfor(int i=str.length()-1; i>=0; i--) {\n" +
				"\t\t\trevStr1 = revStr1 + str.charAt(i);\n" +
				"\t\t}\n" +
				"\t\tSystem.out.println(revStr1);\n" +
				"\n" +
				"\t\t//3.Way: Create a method then call the method from main method\n" +
				"\t\tSystem.out.println(revStr(str));\n" +
				"\t\tString revStr = \"\";\n" +
				"\t\tfor(int i=str.length()-1; i>=0; i--) {\n" +
				"\t\t\trevStr = revStr + str.charAt(i);\n" +
				"\t\t}\n" +
				"\t\treturn revStr;");
	}
	public static String revStr(String str) {


		System.out.println("Enter a String to reverse");
		String str1 = scan.nextLine();

		//1.Way: By using StringBuilder()
		StringBuilder strB = new StringBuilder();
		strB.append(str);
		System.out.println(strB.reverse());

		String revStr1= "";
		//2.Way: By using String Class
		for(int i=str.length()-1; i>=0; i--) {
			revStr1 = revStr1 + str.charAt(i);
		}
		System.out.println(revStr1);

		//3.Way: Create a method then call the method from main method
		System.out.println(revStr(str));
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;
	}
	
	
	
	
	
	
	
	
	
	
}
