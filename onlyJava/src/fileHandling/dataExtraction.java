package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class dataExtraction {
	public static BufferedReader br1;
	public static BufferedReader br2;
	private static PrintWriter pw;
	
	public static void main(String []args) throws IOException{
		pw = new PrintWriter("C://file//fileEXTRACT.txt");
		
		File f1 =new File("C://file//file1.txt");
		br1 = new BufferedReader(new FileReader(f1));
		String line1=br1.readLine();
		
		File f2=new File("C://file//file2.txt");
		
		
		while(line1!=null){
			boolean b=true;
			br2= new BufferedReader(new FileReader(f2));
			String line2=br2.readLine();
			while(line2!=null){
				if(line1.equals(line2)){b=false;
				break;}
				line2=br2.readLine();
			}
			
			if(b==true){
				pw.println(line1);
			}line1=br1.readLine();
		}
		pw.flush();
		
		
		
	}

}
