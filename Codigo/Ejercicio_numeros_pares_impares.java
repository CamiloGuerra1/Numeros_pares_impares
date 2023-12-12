package ejercicio_numeros_pares_impares;
import java.util.*;
//Ejercicio de numeros pares e impares

public class Ejercicio_numeros_pares_impares {
    //Declaración de variables
    public static Ejercicio_numeros_pares_impares pares_impares = new Ejercicio_numeros_pares_impares(); //Declaración de objeto pares_impares
    public static Scanner sc = new Scanner(System.in); //Declarwción de variable Scanner
    public static int numero; //DDeclaración de la variable numero para la lectura
    
    public void numeros_pares_impares (int numero) {
        System.out.print("Señor usuario, por favor digite un número: ");
        numero = sc.nextInt();
        if (numero %2 == 0) {
            System.out.println("El número digitado es par");
        } else {
            System.out.println("El número digitado es impar");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Ejercicio de numeros pares e impares");
        pares_impares.numeros_pares_impares(numero);
    }
    
}
