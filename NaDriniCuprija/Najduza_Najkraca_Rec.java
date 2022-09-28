package Nedelja8.NaDriniCuprija;

// 1. Napisati analizu reči u romanu "Na Drini ćuprija":
//        c) naći najdužu reč
//        d) naći najkraću reč

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Najduza_Najkraca_Rec {
        public static void main(String [ ] args)
                throws FileNotFoundException {

            String najduzaRec = "";
            String najkracaRec = "a";
            String rec;
            Scanner sc = new Scanner(new File("src/Nedelja8/DomaciNedelja_NaDriniCuprija/na drini cuprija"));

            while (sc.hasNext()) {

                rec = sc.next();

                if (rec.length() > najduzaRec.length()) {
                    najduzaRec = rec;
                }

                if (rec.length() <= najkracaRec.length()) {
                    najkracaRec = rec;
                }
            }

            System.out.println("Najduza rec u romanu: " + najduzaRec);
            System.out.println("Najkraca rec u romanu: " + najkracaRec);
        }
    }

