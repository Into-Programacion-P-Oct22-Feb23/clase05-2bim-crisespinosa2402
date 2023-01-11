/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        int valorArreglo;
        System.out.println("Ingrese el tamaño de el arreglo");
        valorArreglo = entrada.nextInt();
        int[] valor = new int[valorArreglo];
        
        for (int num = 0; num < valor.length; num++) {
            System.out.println("Ingrese el valor:");
            valor[num] = entrada.nextInt(); 
        }
        System.out.printf("\nEl total es: %d\n" , misterio(valor, valor.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
