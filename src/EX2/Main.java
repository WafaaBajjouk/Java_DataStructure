package EX2;

import java.util.Scanner;

public class Main {
	
  public static void main (String arg []) {
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("Donnez une valeur !");
	  
	int a = sc.nextInt();
	try {
		EntNat x = new EntNat(a);
		System.out.println("La valeur est :"+x.getEnt());
	} catch (ErrConst e) {
		System.out.println(e.getMessage());
//		e.printStackTrace();
	}
	
}	
}
