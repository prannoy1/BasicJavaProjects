package onlyJava;

public class armstrongRec {
	public static int arm(int number){
		
		// change told by praniti.
		int x;
		if(number==0)
			return 0;
		else{
			x = number%10;
			return (int) (Math.pow(x, 3) + arm(number/10));
		}
			
	}
	//test 
	
	public static void main(String []args){
		for(int i=0;i<10000;i++){
			int z=armstrongRec.arm(i);
			if(z==i){
				System.out.println(i);
			}
		}
		
		
	}

}
