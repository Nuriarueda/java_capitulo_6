/*Ejercicio 3 Igual que el ejercicio anterior pero con la baraja española. 
Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */

public class Ejercicio3 {
    public static void main (String []args) {
        System.out.println("Carta al azar de la baraja española");
        System.out.print("PALO: ");
        int cartas = ((int)(Math.random()*4)+1);

        switch (cartas){
            case (1):
                System.out.print("Oro");
            break;
            case (2):
                System.out.print("Bastos");
            break;
            case (3):
                System.out.print("Copas");
            break;
            case (4):
                System.out.print("Espadas");
            break;
            default:
        }
        System.out.println();
        System.out.print("NUMERO: ");
        int numeros = ((int)(Math.random()*10)+1);

        switch (numeros) {
            case (1):
                System.out.print("As");
            break;
            case (2):
                System.out.print("2");
            break;
            case (3):
                System.out.print("3");
            break;
            case (4):
                System.out.print("4");
            break;
            case (5): 
                System.out.print("5");
            break;
            case (6):
                System.out.print("6");
            break;
            case (7):
                System.out.print("7");
            break;
            case (8):
                System.out.print("Sota");
            break;
            case (9):
                System.out.print("Caballo");
            break;
            case (10):
            System.out.print("Rey");
            break;
            default:      
        }

    }
    
}