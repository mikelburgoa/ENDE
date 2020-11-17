package menuakGIT;

import java.util.Scanner;

public class menuak {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Gehiketa" +
				"2. Kenketa" +
				"3. Biderketa" +
				"4. Zatiketa" +
				"5. Faktorial");
		
		System.out.println("Idatzi bi zenbaki");
		
		int z1;
		int z2;
		
		z1 = input.nextInt(); 
		z2 = input.nextInt(); 
		
		
		int aukerak = 0;
		switch (aukerak) {
		
		case 1:
			System.out.println(z1 + z2);
			break;
			
		case 2:
			System.out.println(z1 - z2);
			break;
			
		case 3:
			System.out.println(z1 * z2);
			break;
				
		case 4:
			System.out.println(z1 / z2);
			break;
			
		case 5:
			double factorial = 1;
			while ( z1!=0) {
				  factorial=factorial*z1;
				  z1--;
				  System.out.println(factorial);
			break;
		
		
		}
		
		
		
	}
	
   }
}
