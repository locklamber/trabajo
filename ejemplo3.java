package trabajo;

import java.util.*;

public class ejemplo3 {
	
	Scanner teclado = new Scanner(System.in);
	
	int num, c;
	double total;
	
	public int recursivo(){
	
		if (num == 0){
			return 1;
		}
		else {
			return num*recursivo(num-1);
		}
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
