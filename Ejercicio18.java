/*Ejercicio 18 Sinestesio y Casilda van a pintar los tres dormitorios de su casa, 
quieren sustituir el color blanco por colores más alegres. Realiza un programa 
que genere de forma aleatoria una secuencia de tres colores aleatorios (uno para cada dormitorio) 
de tal forma que no se repita ninguno. Los colores entre los que debe elegir 
el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.  */

public class Ejercicio18 {
    public static void main (String[]args) {
        System.out.println("Los colores que van a utilizar para pintar los tres dormitorios de su casa son los siguientes");
        do {
            System.out.print("Dormitorio 1: ");
            int color1 = ((int)(Math.random()*6)+1);
            switch(color1) {
                case(1):
                    System.out.print("Rojo");
                break;

                case(2): 
                    System.out.print("Azul");
                break;

                case(3):
                    System.out.print("Verde");
                break;

                case (4):
                    System.out.print("Amarillo");
                break;

                case (5):
                    System.out.print("Violeta");
                break;

                case (6):
                    System.out.print("Naranja");
                break;
                System.out.println();
            }
            
            System.out.print("Dormitorio 2: ");
            int color2 = ((int)(Math.random()*6)+1);
            switch(color2) {
                case(1):
                    System.out.print("Rojo");
                break;

                case(2): 
                    System.out.print("Azul");
                break;

                case(3):
                    System.out.print("Verde");
                break;

                case (4):
                    System.out.print("Amarillo");
                break;

                case (5):
                    System.out.print("Violeta");
                break;

                case (6):
                    System.out.print("Naranja");
                break;
                System.out.println();
            }

            System.out.print("Dormitorio 3: ");
            int color3 = ((int)(Math.random()*6)+1);
            switch(color3) {
                case(1):
                    System.out.print("Rojo");
                break;

                case(2): 
                    System.out.print("Azul");
                break;

                case(3):
                    System.out.print("Verde");
                break;

                case (4):
                    System.out.print("Amarillo");
                break;

                case (5):
                    System.out.print("Violeta");
                break;

                case (6):
                    System.out.print("Naranja");
                break;
            }

        } while ((color1 == color2) && (color2 == color3) && (color1 == color3));
    }
}


    
    
