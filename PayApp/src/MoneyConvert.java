 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class MoneyConvert {
	 static String fileName;
	 static String test;
	 static String ans;
	 
	
	public MoneyConvert( String fileName, String test) {
		this.fileName = fileName;
		this.test = test;
	}
	public static String getAns() {
		String number = fileName;
        double d = Double.parseDouble(number);
        double tax = d * .07;
        double fin = tax + d;
		String per = test;
        double dd = Double.parseDouble(per);
        double end = fin * dd;
        double finish = fin - end;
        
        return ( "$ "+finish);
        
        
 
		
	}
	public static String getFileName() {
		return fileName;
	}
	public static void setFileName(String fileName) {
		DFA.fileName = fileName;
	}
	public static void setAns(String ans) {
		DFA.ans = ans;
	}
	
}