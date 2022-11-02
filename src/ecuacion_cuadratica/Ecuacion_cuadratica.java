package ecuacion_cuadratica;

import java.util.Scanner;

public class Ecuacion_cuadratica {

	public static void main(String[] args) {
		int a, b, c;
		double x1, x2;
		int discriminante;

		Scanner cin = new Scanner(System.in);

		System.out.println("Ingrese el valor de a");
		a = cin.nextInt();
		System.out.println("Ingrese el valor de b");
		b = cin.nextInt();
		System.out.println("Ingrese el valor de c");
		c = cin.nextInt();

		discriminante = (b * b) - (4 * a * c);

		if (discriminante > 0) {
			System.out.println("\nLa ecuación tiene dos soluciones");
			
			x1 = (-b + Math.sqrt(discriminante)) / 2 * a;
			x2 = (-b - Math.sqrt(discriminante)) / 2 * a;

			System.out.println(String.format("Solución x1: %.0f", x1));
			System.out.println(String.format("Solución x2: %.0f", x2));

		} else if (discriminante == 0) {
			System.out.println("\nLa ecuacion tiene una unica solucion");
			
			x1 = (-b) / 2 * a;
			System.out.println(String.format("Solución x1: %.0f", x1));
			
		} else {
			System.out.println("\nLa ecuación no tiene solución");
		}
	}

}
