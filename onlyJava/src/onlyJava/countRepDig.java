package onlyJava;

import java.util.HashMap;
import java.util.Map;

public class countRepDig {
	public static void main(String []args){
		int number=1010100222;
		int x;
		Map<Integer, Integer> m= new HashMap<Integer, Integer>();
		while(number!=0){
			x=number%10;
			System.out.println(x);
			if(m.containsKey(x)){
				m.put(x, m.get(x)+1 );
			}
			else m.put(x, 1);
					
			number=number/10;
		}
		System.out.println(m);
	}

}
