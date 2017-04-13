package onlyJava;

public class reverseDigits {
	public static void main(String []args){
		int number=54821,n,reverse=0;
		while(number!=0){
			n=number%10;
			reverse=reverse*10+n;
			number=number/10;
		}
			System.out.println(reverse);
	}

}
