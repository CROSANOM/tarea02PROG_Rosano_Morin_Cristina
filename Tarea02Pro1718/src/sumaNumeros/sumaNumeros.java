/**
 * 
 */
package sumaNumeros;

/*Ejercicio 3. Escribe un programa que lea un n�mero positivo y seguidamente empiece a pedir n�meros (positivos y negativos) hasta que su suma coincida o 
 supere el primer n�mero introducido. Finalmente el programa mostrar� la suma de los n�meros introducidos (a excepci�n del primero) y la cantidad de n�meros introducidos (otra vez sin contar el primero).
El programa debe asegurarse de que el primer n�mero que se introduce es un n�mero positivo.*/
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
	} // fin m�todo

}// fin clase
