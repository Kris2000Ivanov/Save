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
	System.out.println("please input a number: ");
	int number=input.nextInt();
	FileWriter output = new FileWriter(file, true);
	output.append("\n"+number+"\n");
	input.close();
	output.close();	
	
	ReadFile r=new ReadFile();
	System.out.println("this is your information so far:");
	r.openFile();
	r.readfile();
	r.closeFile();
}
}
