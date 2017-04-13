package onlyJava;

public class armstrongRec {
	public static int arm(int number){
		int x;
		if(number==1)
			return 1;
		else{
			x = number%10;
			
			return (int) (Math.pow(x, 3) + arm(number/10));
		}
			
	}
	//test
	
	public static void main(String []args){
		System.out.println(armstrongRec.arm(200));
		
	}

}
