package Nedelja8.NaDriniCuprija;

// 1. Napisati analizu reči u romanu "Na Drini ćuprija":
//        *e) naći 10 najkraćih reči

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Najkracih10_Reci {
    public static void main(String[] args)
            throws FileNotFoundException {

        String najkracaRec = "aa";
        String rec;
        Scanner sc = new Scanner(new File("src/Nedelja8/DomaciNedelja_NaDriniCuprija/na drini cuprija"));

        System.out.println("10 najkracih reci u romanu: ");
        for (int i = 0; i <= 100; i++){

            rec = sc.next();

            if (rec.length() < najkracaRec.length()) {
                System.out.println(rec);
            }
        }
    }
}



