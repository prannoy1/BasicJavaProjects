package onlyJava;

public class reverseString {
	public static void main(String []args){
		String s="abcdefgh";
		String rev="";
		for(int i=(s.length()-1);i>=0;i--){
			rev=rev+s.charAt(i);
			//System.out.print(s.charAt(i));
		}
		System.out.println(rev);
			
	}

}
