package onlyJava;

public class pattern {
	public static void main(String []args){
		
		int n = 3;
		int x=n;
		int y=0;
		
		
		for(int i=0; i<n; i++){
			x =x-y;
			for(int j=0;j<x;j++){
				System.out.print(" ");
			}
			
			for(int k=0;k<1;k++){
				System.out.print(k+1);
			}
			
			for(int j=0;j<x;j++){
				System.out.print(" ");
			}
			System.out.println("");
			y++;
		}
	}

}
