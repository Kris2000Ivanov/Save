package LetMeGiveItAnotherTry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class SaveInformation {
public static void main(String[] args) throws IOException {
	File file=new File("info.txt");
	Scanner input=new Scanner(System.in);
	int number=input.nextInt();
	FileWriter output = new FileWriter(file, true);
	output.append("\n"+number);
	input.close();
	output.close();	
	try {
		Scanner read=new Scanner(file);
		int age=read.nextInt();
		read.close();
		System.out.println("The number is "+age);
	}catch(FileNotFoundException ex) {
		
	}
}
}
