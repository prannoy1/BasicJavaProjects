package onlyJava;

public class armstrong {
	public static void main(String []args){
		int number,number1=372,x,an=0;
		number=number1;
		while(number!=0){
			x=number%10;
			an=(int) (an+(Math.pow(x, 3)));
			number=number/10;
		}
		if(number1==an){
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
