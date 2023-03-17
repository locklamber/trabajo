package trabajo;

import java.util.*;

public class ejemplo3 {
	
	Scanner teclado = new Scanner(System.in);
	
	private int x, y;

	public void inicializar() {
	
		System.out.println("Ingrese x :");
		x=teclado.nextInt();

		System.out.println("Ingrese y :");
		y=teclado.nextInt();

	}
	
	public void Imprimir() {
		if (x > 0 && y > 0) {
			System.out.print("Primer cuadrante");
		}
		else if (x < 0 && y > 0) {
			System.out.print("Segundo cuadrante");
		}
		else if (x < 0 && y < 0) {
			System.out.print("Tercer cuadrante");
		}
		else if (x > 0 && y < 0) {
			System.out.print("Cuarto cuadrante");
		}
		else if (x == 0 && y == 0) {
			System.out.print("Centro del cuadrante ");
		}
		
	}
	
	public static void main(String[] ar) {

		ejemplo3 Cuadrante;
		Cuadrante=new ejemplo3();
		Cuadrante.inicializar();
		Cuadrante.Imprimir();
}

}
