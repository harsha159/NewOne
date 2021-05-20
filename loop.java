package programs;

public class loop {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k=1;
		
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=5-i;j++) {
				System.out.print(j);
			System.out.print("\t");
				
				//k++;
			}
			
			System.out.println(" ");
		}
		
  
	}

}
