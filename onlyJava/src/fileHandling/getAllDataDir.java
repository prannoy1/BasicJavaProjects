package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class getAllDataDir {
	public static void main(String []args) throws IOException{
		File f = new File("C://file");
		
		PrintWriter pw= new PrintWriter("C://file//fileAll.txt");
		BufferedReader br;
		String []s = f.list();
		for(String file : s){
			br= new BufferedReader(new FileReader(new File(f,file)));
			String line=br.readLine();
			while(line!=null){
				pw.println(line);
				line=br.readLine();
			}pw.flush();
		}pw.close();
		
		
	}

}
