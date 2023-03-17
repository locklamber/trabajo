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
	
	public void imprimir() {
		
		if (lado1>lado2 && lado1>lado3) {
			System.out.println("el lado 1 es mayor");
		}
		else if (lado2 > lado3) {
			System.out.println("el lado 2 es mayor ");
		}else if (lado3 > lado2){
			System.out.println("el lado 3 es mayor ");
		}
		
		}
	
	public void Equilatero() {
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("es equilatero");
		}
	}

}
