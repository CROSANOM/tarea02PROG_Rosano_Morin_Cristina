/**
 * 
 */
package notas; // paquete 

import utilidades.Entrada;

/*Ejercicio 1
 
Realiza un programa que lea por teclado las notas de los diferentes instrumentos de calificación que utilizamos en la modalidad semipresencial para una evaluación
y a continuación calcule y muestre por pantalla la nota final de dicha evaluación atendiendo a los siguientes criterios:

La participación pondera un 10% de la nota final.
Los cuestionarios online pondera un 5 % de la nota final.
La tarea online pondera un 25% de la nota final.
La tarea presencial pondera un 25% de la nota final.
El examen presencial pondera un 35% de la nota final.
En el caso de que la tarea online, la tarea presencial o el examen presencial no supere el 5, la nota final será un 4.
Debes validar que las entradas para cada instrumento están comprendidas entre 0 y 10 (ambos inclusive).
	 */
/**
 * @author crosanom
 *
 */
public class notasT2 {

	public static void main(String[] args) {// metodo

		// declaran variables

		double partic, cuestionario, tOnline, tPresencial, examen, notaFinal;

		//do {

			System.out.println("INTRODUCE puntuación para la participación ");
			partic = Entrada.realDoble();

		//}
			if (partic <= 0 || partic >=10){
				System.out.println("introduce un numero entre 0-10");
			}
						else {
							System.out.println("INTRODUCE puntuación para la participación ");
							partic = Entrada.realDoble();
			}
			
	

		do {

			System.out.println("INTRODUCE puntuación para el cuestionario ");
			cuestionario = Entrada.realDoble();

		} while (cuestionario <= 0 && cuestionario >= 10);

		do {
			System.out.println("INTRODUCE puntuación para la tarea Online ");
			tOnline = Entrada.realDoble();

		} while (tOnline >= 0 && tOnline >= 10);

		do {

			System.out.println("INTRODUCE puntuación para la tarea Presencial ");
			tPresencial = Entrada.realDoble();

		} while (tPresencial >= 0 && tPresencial >= 10);

		do {

			System.out.println("INTRODUCE puntuación para el examen ");
			examen = Entrada.realDoble();

		} while (examen >= 0 && examen >= 10);

		if (tOnline >= 5 && tPresencial >= 5 && examen >= 5) {

			partic = partic * 0.10;
			cuestionario = cuestionario * 0.05;
			tOnline = tOnline * 0.25;
			tPresencial = tPresencial * 0.25;
			examen = examen * 0.35;
			notaFinal = examen + tPresencial + tOnline + cuestionario + partic;

			System.out.println("El valor de la participación es " + " " + partic);
			System.out.println("El valor del cuestionario es " + " " + cuestionario);
			System.out.println("El valor de la tarea Online es " + " " + tOnline);
			System.out.println("El valor de la tarea Presencial es " + " " + tPresencial);
			System.out.println("El valor del examen es " + " " + examen);
			System.out.println("El valor de la nota final es " + " " + notaFinal);

		} // fin if

		else {// abre else

			System.out.println("La nota final es 4.");
		} // cierra else

	}// cierra metodo main

}// cierra la clase
