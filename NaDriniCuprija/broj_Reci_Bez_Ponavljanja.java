package Nedelja8.NaDriniCuprija;

// 1. Napisati analizu reči u romanu "Na Drini ćuprija":
//        b) izbrojati koliko različitih reči ima u romanu (bez ponavljanja)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class broj_Reci_Bez_Ponavljanja {
    public static void main(String[] args)
            throws FileNotFoundException {

        File file = new File("src/Nedelja8/DomaciNedelja_NaDriniCuprija/na drini cuprija");
        ArrayList arr = new ArrayList();
        HashMap<String, Integer> reciBezPonavljanja = new HashMap<>();
        Scanner sc = new Scanner(file);

        int brojReciBezPonavljanja=0;

        while(sc.hasNext()) {
            String rec = sc.next();
            arr.add(rec);
        }

        for (Object o : arr) {
            brojReciBezPonavljanja++;
            reciBezPonavljanja.put((String) o, brojReciBezPonavljanja);
        }

        Set<Object> uniqueValues = new HashSet<>(reciBezPonavljanja.values());
        System.out.println("Broj reci bez ponavljanja u romanu: " + uniqueValues.size());
    }
}

