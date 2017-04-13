package onlyJava;

public class ReplaceSubString {
	public static void main(String []args){
		String main="this is a string and string and another string";
		System.out.println(main);
		String substringTR = "string";
		String substringRW = "class";
		String arr[] = main.split(substringTR);
			
		StringBuffer x= new StringBuffer();
		for(int i=0;i<=arr.length-1;i++){
			x=x.append(arr[i]);
			if(i!=arr.length-1){
				x=x.append(substringRW);
			}
		}
		System.out.println(x);
	}

}
