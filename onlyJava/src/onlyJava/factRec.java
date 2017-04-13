package onlyJava;

public class factRec {
	int factorial(int number){
		if(number==0)
		return 1;
		else
			return (number*factorial(number-1));
		
	}
	
	public static void main(String[] args){
		factRec f=new factRec();
		System.out.println(f.factorial(4));
	}

}
