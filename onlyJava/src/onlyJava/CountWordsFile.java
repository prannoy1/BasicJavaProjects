package onlyJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CountWordsFile  {
	private static BufferedReader br;

	public static void main (String []args) throws IOException{
		Map<String, Integer> m= new HashMap<String, Integer>();
		
		File f = new File("C://file//fileRead.txt");
		br = new BufferedReader(new FileReader(f));
		String s = br.readLine();
		while(s!=null){
			 StringTokenizer z= new StringTokenizer(s, " ,.");
					 while(z.hasMoreTokens()){
						 String w=z.nextToken();
						 if(m.containsKey(w)) m.put(w, m.get(w)+1);
						 else m.put(w, 1);
					 }
					 s=br.readLine();
		}br.close();
		System.out.println(m);
	}

}
