/**
 * 
 */
package numeroContruido;

/*Ejercicio 2. Escribe un programa que dado un n�mero positivo realice el desplazamiento del mismo una posici�n hacia la derecha.
El desplazamiento hacia la derecha consiste en coger la �ltima cifra de la derecha del n�mero y ponerla a la izquierda. Por ejemplo: 2476 -> 6247, 123 -> 312, 987 -> 798....
El programa debe asegurarse de que se introduce un n�mero positivo.*/

/**
 * @author crosanom
 *
 */
public class numeroConstruido {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declarar e inicializar variable

		int numero = 3107;
		int ultimoNumero;
		int restoNumero;
		int nuevoNumero;

		ultimoNumero = (numero) % 10;
		System.out.println(ultimoNumero);// imprime 7
		restoNumero = (numero / 10);

		System.out.println(restoNumero);// imprime 310
		System.out.print("el numero que hemos construido es  " + ultimoNumero + restoNumero);

		// TODO Auto-generated method stub

	}

}
