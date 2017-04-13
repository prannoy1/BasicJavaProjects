package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class mergeLinAfLine {
	
	private static BufferedReader br1;
	private static BufferedReader br2;

	public static void main(String []args)throws IOException{
		PrintWriter pw= new PrintWriter("C://file//fileTarget.txt");
		
		File f1 =new File("C://file//file1.txt");
		br1 = new BufferedReader(new FileReader(f1));
		String line1=br1.readLine();
		
		File f2=new File("C://file//file2.txt");
		br2= new BufferedReader(new FileReader(f2));
		String line2=br2.readLine();
		
		
		while(line1!=null || line2!=null){
			pw.println(line1);
			pw.println(line2);
			line1=br1.readLine();
			line2=br2.readLine();
		}
		pw.flush();
		pw.close();
	
	}

}
