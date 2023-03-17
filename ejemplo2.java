package trabajo;

import java.util.*;

public class ejemplo2 {
	
	Scanner teclado = new Scanner(System.in);
	
	private double lado1, lado2, lado3;

	public void inicializar() {
	
		System.out.println("Ingrese el primer lado del trangulo:");
		lado1=teclado.nextInt();

		System.out.println("Ingrese el segundo lado del triangulo:");
		lado2=teclado.nextInt();

		System.out.println("Ingrese el tercer lado del triangulo:");
		lado3=teclado.nextInt();
	}

}
