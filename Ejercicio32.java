/*Ejercicio 32 Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter “|”. 
La anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres 
en medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar 
recto, girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. 
Por cada metro de sendero - representado por una línea - puede que haya un obstáculo o puede que no, 
la probabilidad es del 50%. La posición del obstáculo es aleatoria dentro de la línea. 
En caso de existir un obstáculo en un metro de sendero (en una línea), puede ser una planta (carácter *) 
o una piedra (carácter O), la probabilidad de que salga uno u otro es la misma. 
Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.*/

import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitudSendero = Integer.parseInt(s.nextLine());
        int espaciosPorDelante = 6;
        for (int i = 0; i < longitudSendero; i++) {
            for (int j = 0; j < espaciosPorDelante; j++) {
                System.out.print(' ');
            }
            System.out.print('|');
            int posicionObstaculo = -1;
            char obstaculo = '*'; 
            if ((int) (Math.random() * 2) == 0) { 
                posicionObstaculo = (int) (Math.random() * 4);
                if ((int) (Math.random() * 2) == 0) { 
                    obstaculo = 'O';
                }
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(j == posicionObstaculo ? obstaculo : ' ');
            }
            System.out.println('|');
            espaciosPorDelante += (int) (Math.random() * 3) - 1;
        }
        s.close();
    }
}
