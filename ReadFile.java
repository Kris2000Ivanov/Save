package LetMeGiveItAnotherTry;
import java.util.*;
import java.io.*;
public class FileReader {
private Scanner x;
public void openFile() {
	try {
		x=new Scanner(new File("filePath"));
	}
	catch(Exception e) {
System.out.println("Could not find file");		
	}
}
public void readfile() {
while(x.hasNext()) {
	String a=x.next();
	System.out.printf("%s \n",a);
}
}
public void closeFile() {
	x.close();
}
}
