package onlyJava;


import java.util.HashMap;
import java.util.Map;

public class countRepChar {
	public static void main(String []args){
		String s= "ababaccdddeefff";
		char c;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if(m.containsKey(c)){
				m.put(c, m.get(c) + 1);
			}
			else
				m.put(c, 1);
		}
		System.out.println(m);
	}

}
