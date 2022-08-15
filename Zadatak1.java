package Nedelja3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Zadatak1 {
    public static int[] matrica() {
        Scanner sc = new Scanner(System.in);
        Stack <int[]> temp = new Stack<>();
        System.out.println("Unesite broj redova i kolona matrice.");
        System.out.println("Broj redova: ");
        int redovi = sc.nextInt();
        System.out.println("Broj kolona: ");
        int kolone = sc.nextInt();

        int[][] niz = new int[redovi][kolone];

        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                System.out.println("Unesite [" + i + "]" + "[" + j + "] - ");
                int broj = sc.nextInt();
                niz[i][j] = broj;
            }
        }

        for (int[] ints : niz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        int sumaRedova = 0;
        for (int i = 0; i < redovi; i++) {
            for (int j = 0; j < kolone; j++)
                sumaRedova += niz[i][j];
            System.out.println("Suma " + (i + 1) + ". reda je: " + sumaRedova);
            sumaRedova = 0;
        }

        int suma = 0;
        int suma1 = 0;
        for (int[] ints : niz) {
            for (var j = 0; j < niz.length; j++)
                suma1 += ints[j];

            if (suma <= suma1) {
                temp.push(ints);
                suma = suma1;
            }
        }
        return temp.pop();
    }

    public static void main (String[]args) {
        System.out.println(Arrays.toString(matrica()));
    }
}



