package onlyJava;

import java.util.Arrays;

public class secLargNumArr {
	public static void main(String []args){
		int arr[] ={5,56,78,43,23,1,1,4,2,2,2,2,1};
		Arrays.sort(arr);
		for(int ar: arr){
		System.out.println(ar);
		}
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]) {System.out.println("sec lar : "+ arr[i+1]);break;}
			
		}
		
			
		
		
		}
		
		
		
	}


