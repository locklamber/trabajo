package trabajo;

import java.util.*;

public class ejemplo3 {
	
	public int num, c;
	double total;
	
	Scanner teclado = new Scanner(System.in);
	
	public void iterativo (int c){
		int double total = 1;
		do { 
			total = total*c ;
			c--;
		}
		while(c>=1);
		system.out.println(total);
	}

	public static void main(String[] ar) {

		ejemplo3 factorial;
		factorial=new ejemplo3();
		System.out.println("Ingrese el numero");
		int num = teclado.nextInt():
		int fact=factorial.recursivo(num);
		System.out.println(fact);
}


}
