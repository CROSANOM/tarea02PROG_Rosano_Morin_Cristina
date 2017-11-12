/**
 * 
 */
package sumaNumeros;

/*Ejercicio 3. Escribe un programa que lea un número positivo y seguidamente empiece a pedir números (positivos y negativos) hasta que su suma coincida o 
 supere el primer número introducido. Finalmente el programa mostrará la suma de los números introducidos (a excepción del primero) y la cantidad de números introducidos (otra vez sin contar el primero).
El programa debe asegurarse de que el primer número que se introduce es un número positivo.*/
import utilidades.Entrada;

/**
 * @author crosanom
 *
 */
public class sumaNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int numero, suma, numeroAux, contador;

		// inicializar variables.
		suma = 0;
		contador = 0;

		// valida entrada de numero positivo
		do {
			System.out.println("introduce un numero positivo");
			numero = Entrada.entero();

			if (numero <= 0) {
				System.out.println("El numero debe ser positivo y mayor que cero");
			}

		} while (numero <= 0);

		while (suma < numero) { // abre while

			System.out.println("introduce numero"); // introduce numero
			numeroAux = Entrada.entero(); // lee el numero
			suma += numeroAux; // suma
			contador++;

		} // fin while

		System.out.println("la suma de numeros es " + suma + " el numero original es " + numero);
		System.out.println("se han sumado " + contador + " numeros ");
	} // fin método

}// fin clase
