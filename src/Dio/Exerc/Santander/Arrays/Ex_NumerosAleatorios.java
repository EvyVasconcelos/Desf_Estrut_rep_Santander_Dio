package Dio.Exerc.Santander.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("Antecessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println((numero-1) + " ");
        }

    }
}
