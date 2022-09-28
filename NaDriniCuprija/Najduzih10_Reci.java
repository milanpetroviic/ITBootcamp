package Nedelja8.NaDriniCuprija;

// 1. Napisati analizu reči u romanu "Na Drini ćuprija":
//        *f) naći 10 najdužih reči

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Najduzih10_Reci {
    public static void main(String[] args)
            throws FileNotFoundException {

        String najduzaRec = "123456";
        String rec;
        Scanner sc = new Scanner(new File("src/Nedelja8/DomaciNedelja_NaDriniCuprija/na drini cuprija"));

        System.out.println("10 najduzih reci u romanu: ");
        for (int i = 0; i < 10; i++) {
            while (sc.hasNext()) {

                rec = sc.next();

                if (rec.length() > najduzaRec.length()) {
                    najduzaRec = rec;
                    System.out.println(najduzaRec);
                }
            }
        }
    }
}


