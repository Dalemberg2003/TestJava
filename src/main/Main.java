package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //todos los metodos van aqui
    public static int OrdenarArreglo(int[] numeros) {

        Arrays.sort(numeros);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(" " + numeros[i]);
        }
        return 0;
    }

    public static int Indicador(int[] numeros2) {

        try {
            boolean creciente = false;
            boolean decreciente = false;

            for (int i = 0; i < numeros2.length; i++) {

                if (numeros2[i] > numeros2[i + 1]) {
                    decreciente = true;
                }
                if (numeros2[i] < numeros2[i + 1]) {
                    creciente = true;
                }
                if (creciente == true && decreciente == false) {
                    System.out.println("serie creciente");
                }
                if (creciente == false && decreciente == true) {
                    System.out.println("serie decreciente");
                }
                if (creciente == true && decreciente == true) {
                    System.out.println("serie revuelta");
                }
                if (creciente == false && decreciente == false) {
                    System.out.println("todos son iguales");
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        return 0;
    }

    public static void NPerfecto(int n) {
        int i, suma = 0;
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (n % i == 0) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }

    public static void Palindromo(String sPalabra) {
        int inc = 0;
        int des = sPalabra.length() - 1;
        boolean bError = false;

        while ((inc < des) && (!bError)) {

            if (sPalabra.charAt(inc) == sPalabra.charAt(des)) {
                inc++;
                des--;
            } else {
                bError = true;
            }
        }

    }
    
    

    public static void main(String[] args) {

        //aqui se va a correr el programa
        
        //metodo 1        
        //int [] numeros = {2,5,10,9,1,3,6,4};
        //OrdenarArreglo(numeros);
        
        //metodo 2    
        //int[] numeros2 = {1,2,3,4,5,6};
        //Indicador(numeros2);
        
        //metodo 3
        //int num = 5;
        //NPerfecto(num);
        
        //metodo 4
        //String sPalabra = "papa";
        //Palindromo(sPalabra);
    }

}
