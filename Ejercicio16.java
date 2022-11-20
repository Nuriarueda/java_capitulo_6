/*Ejercicio 16 Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos: 
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. 
Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón. 
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”. 
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. 
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”. */

public class Ejercicio16 {
    public static void main (String[]args) {
        System.out.println("Las figuras de la tirada son las siguientes: ");

        
        int figura1 = ((int)(Math.random()*5)+1);
        switch (figura1) {
            case (1):
                System.out.print("Corazón");
            break;
            
            case (2):
                System.out.print("Diamante");
            break;
            
            case (3):
                System.out.print("Herradura");
            break;

            case (4):
                System.out.print("Campana");
            break;

            case (5):
                System.out.print("Limón");
            break;
        }
        System.out.println();

        int figura2 =((int)(Math.random()*5)+1);
        switch (figura2) {
            case (1):
                System.out.print("Corazón");
            break;
            
            case (2):
                System.out.print("Diamante");
            break;
            
            case (3):
                System.out.print("Herradura");
            break;

            case (4):
                System.out.print("Campana");
            break;

            case (5):
                System.out.print("Limón");
            break;
        }
        System.out.println();

        int figura3 =((int)(Math.random()*5)+1);
        switch (figura3) {
            case (1):
                System.out.print("Corazón");
            break;
            
            case (2):
                System.out.print("Diamante");
            break;
            
            case (3):
                System.out.print("Herradura");
            break;

            case (4):
                System.out.print("Campana");
            break;

            case (5):
                System.out.print("Limón");
            break;
        }
        System.out.println();
        
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
            System.out.print("Lo siento, has perdido");
        } else if ((figura1 == figura2) || (figura2 == figura3) || (figura3 == figura1)) {
            System.out.print ("Bien, ha recuperado sus monedas");
        } else {
            System.out.print("Ha ganado 10 monedas");
        }
    }
}