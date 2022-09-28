package Nedelja8.NaDriniCuprija;

// 1. Napisati analizu reči u romanu "Na Drini ćuprija":
//        *g) naći 10 najkorišćenijih reči i broj njihovog ponavljanja

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;

    public class Najkoriscenije_Reci {
        public static void main(String[] args) {
            Map<String, Integer> najkoriscenijeReci = najkoriscenijeReci("src/Nedelja8/DomaciNedelja_NaDriniCuprija/na drini cuprija");
            List<Entry<String, Integer>> lista = sortiranje(najkoriscenijeReci);
            for (Map.Entry<String, Integer> ulaz : lista) {
                if (ulaz.getValue() > 900) {
                    System.out.println("Rec: " + ulaz.getKey() + ", se ponavlja: " + ulaz.getValue() + " puta.");
                }
            }
        }
        public static Map<String, Integer> najkoriscenijeReci(String Fajl) {
            Map<String, Integer> recMap = new HashMap<>();

            try (FileInputStream fis = new FileInputStream(Fajl);
                 DataInputStream dis = new DataInputStream(fis);
                 BufferedReader br = new BufferedReader(new InputStreamReader(dis))) {

                 Pattern pattern = Pattern.compile("\\s+");
                 String linija;

                 while ((linija = br.readLine()) != null) {

                    linija = linija.toLowerCase();
                    String[] reci = pattern.split(linija);

                    for (String rec : reci) {
                        if (recMap.containsKey(rec)) {
                            recMap.put(rec, (recMap.get(rec) + 1));
                        } else {
                            recMap.put(rec, 1);
                        }
                    }
                }
            }
            catch (IOException ioex) {
                ioex.printStackTrace();
            }
            return recMap;
        }
        public static List<Entry<String, Integer>> sortiranje(Map<String, Integer> recMap) {
            Set<Entry<String, Integer>> ulazi = recMap.entrySet();
            List<Entry<String, Integer>> lista = new ArrayList<>(ulazi);
            lista.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
            return lista;
        }
    }

