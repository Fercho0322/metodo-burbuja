package burbuja;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int n;
        System.out.println("Digite el tamaño del vector: ");
        n = lectura.nextInt();
        int[] vec = new int[n];

        for (int i = 0; i < vec.length; i++) {
            System.out.println("Digite el valor de cada casilla: ");
            int j = vec[i];
            vec[i] = lectura.nextInt();

        }
        for (int i = 1; i < n - 1; i++) {
            int cp = 0;
            cp++;
            for (int j = 1; j < n - 1; j++) {
                int cont_int = 0;
                cont_int++;
                if (vec[j] > vec[j + 1]) {
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;

                }
         for (int k = 0; k < vec.length; k++) {
          System.out.println(" El ordenamiento del vector es: " + vec[i]);
         // System.out.println("El contador de comparaciones: " + cp "El numero de intercambios: "+ con_int);

                }
            }
        }
    }
}
