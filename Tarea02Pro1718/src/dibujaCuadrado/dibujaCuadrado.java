/**
 * 
 */
package dibujaCuadrado;

import utilidades.Entrada;

/*Ejercicio 4. Realiza un programa que pida un n�mero positivo mayor que cero por teclado y un car�cter y
  dibuje un cuadrado de lado el n�mero anterior y utilice para pintarlo el car�cter le�do.
El programa debe asegurarse de que el primer n�mero que se introduce es un n�mero positivo mayor que cero*/

/**
 * @author crosanom
 *
 */
public class dibujaCuadrado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declarar variables

		int numero;
		char caracter;

		// valida la entrada de datos

		do {
			System.out.println("introduce un numero mayor que cero");
			numero = Entrada.entero();
			System.out.println("introduce un car�cter");
			caracter = Entrada.caracter();
		} while (numero < 0);

		for (int i = 0; i < numero; i++) {// abre primer for
			for (int j = 0; j < numero; j++) {

				System.out.print(caracter);

			}

			System.out.println(caracter);
		} // cierra primer for

		// TODO Auto-generated method stub

	}

}
