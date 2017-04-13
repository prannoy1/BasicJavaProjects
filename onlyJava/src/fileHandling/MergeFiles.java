package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFiles {
	private static BufferedReader br;

	public static void main(String []args)throws IOException{
		PrintWriter pw= new PrintWriter("C://file//file3.txt");
		File f =new File("C://file//file1.txt");
		br = new BufferedReader(new FileReader(f));
		String line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
		
		f=new File("C://file//file2.txt");
		br= new BufferedReader(new FileReader(f));
		line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		pw.close();
	}

}
