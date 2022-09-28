package Nedelja8.NaDriniCuprija;

// 1. Napisati analizu reči u romanu "Na Drini ćuprija":
//        a) izbrojati koliko reda teksta ima u romanu (u našem fajlu)
//       *h) naći koliko rečenica (završavaju se sa ".") ima u romanu

import java.io.*;

public class broj_Reci_Recenica_Reda {
    public static void main(String[] args)
            throws IOException {

            File file = new File("src/Nedelja8/DomaciNedelja_NaDriniCuprija/na drini cuprija");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String linija;
            int brojReci = 0;
            int brojRecenica = 0;
            int brojReda = 0;

            while ((linija = bufferedReader.readLine()) != null) {
                String[] rec = linija.split("\\s");
                brojReci += rec.length;

                String[] recenica = linija.split("[?!.]");
                brojRecenica += recenica.length;

                brojReda++;
            }

            System.out.println("Broj reci u romanu: " + brojReci);
            System.out.println("Broj recenica u romanu: " + brojRecenica);
            System.out.println("Broj reda teksta u romanu: " + brojReda);
    }
}





