package trabajo;

import java.util.*;

public class ejemplo1 {

	private double lado, perimetro, area ;

	public void inicializar() {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el lado del cuadrado :");
		lado=teclado.nextInt();

	}
	
	public void calculo() {
		
		perimetro = 4 * lado;
		
		area = lado * lado;
		
	}
	
	public  void imprimir() {
		
		System.out.println("Su perimetro es :" + perimetro);
	
		System.out.println("Su area es :" + area);
		
	}
	
}
