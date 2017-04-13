package onlyJava;

public class primeNumCheck {
	
	public static boolean check(int number){
		int x;
		for(int i=2;i<number/2;i++){
			 x = number%i;
			if(x==0) return false;
					
		}
		return true;
	}
	
	public static void main(String []args){
		System.out.println(primeNumCheck.check(21));
		
		
	}

}
