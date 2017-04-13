package onlyJava;

public class newpattern {
	public static void main(String []args){
		
		int rowCount=1;
		int noOfRows = 5;
	for (int i = noOfRows; i > 0; i--)
	{
		//Printing i*2 spaces at the beginning of each row

		for (int j = 1; j <= i*2; j++)
		{
			System.out.print("x");
		}

		//Printing j value where j value will be from 1 to rowCount

		for (int j = 1; j <= rowCount; j++) 			
		{
			System.out.print(j+" ");
		}

		//Printing j value where j value will be from rowCount-1 to 1
		
		for (int j = rowCount-1; j >= 1; j--)
		{ 				
			System.out.print(j+" "); 			
		} 			 			
		
		System.out.println();

		//Incrementing the rowCount

		rowCount++;
	}
}
}


