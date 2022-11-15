/*Ejercicio 14 El programa intentará adivinar el número 
que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. 
En cada intento fallido, el programa debe preguntar si el número 
que estás pensando es mayor o menor que el que te acaba de decir. */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String []args ) {
        Scanner s = new Scanner (System.in);

        int oportunidad = 0;
        int numPensado;
        int numRandom;

        System.out.println("Piensa un numero aleatorio entre el 0 y 100 (incluyéndolos)");
        System.out.println("Ahora trataré de adivinarlo, tengo 5 intentos");
        System.out.print("El numero que estas pensado es: ");
        numPensado = s.nextInt();
        numRandom = (int)(Math.random()*101);
        
        do {
            numRandom = (int)(Math.random()*101);
            System.out.println("¿El numero que has pensado es " + numRandom + " ?");
            if (numRandom == numPensado) {
                System.out.print("¡He acertado el numero!");
                oportunidad = 5;
            } else if ( numRandom < numPensado) {
                System.out.println("El numero pensado es mayor");
                oportunidad++;
            } else if ( numRandom > numPensado) {
                System.out.println("El numero pensado es menor");
                oportunidad++;
            }
        } while (oportunidad != 5);
        s.close ();
    }
}