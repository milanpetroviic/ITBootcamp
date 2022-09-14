package ProjekatNedelja7.ProjekatKuhinja;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class RecipeBase {
    private static final ArrayList<Recipe> sviRecepti = new ArrayList<>();
    public static final HashMap<String, Recipe> recept = new HashMap<>();
    public static void Recept (Recipe recept){
        sviRecepti.add(recept);
    }
    public static ArrayList<Recipe> x() {
        return sviRecepti;
    }
    public static void sviRecepti() {

        Recipe Palacinka = new Recipe("Palacinka sa kremom i plazmom", PrescriptionWeight.EASY);
        RecipeBase.dodajRecept(Palacinka);
        Palacinka.dodajSastojak("Brasno", 200);
        Palacinka.dodajSastojak("Jaje", 2);
        Palacinka.dodajSastojak("Ulje", 0.1);
        Palacinka.dodajSastojak("Mleko", 0.3);
        Palacinka.dodajSastojak("So", 0.1);
        Palacinka.dodajSastojak("Secer", 0.1);
        Palacinka.dodajSastojak("Krem", 200);
        Palacinka.dodajSastojak("Plazma", 200);

        Recipe Pica = new Recipe("Mix pica", PrescriptionWeight.MEDIUM);
        RecipeBase.dodajRecept(Pica);
        Pica.dodajSastojak("Kvasac", 0.5);
        Pica.dodajSastojak("Paradajz", 1);
        Pica.dodajSastojak("Brasno", 0.5);
        Pica.dodajSastojak("Origano", 0.1);
        Pica.dodajSastojak("Pecenica", 0.2);
        Pica.dodajSastojak("Kobasica", 0.2);
        Pica.dodajSastojak("Sir", 0.1);
        Pica.dodajSastojak("Prsuta", 0.2);

        Recipe Tost = new Recipe("Tost",PrescriptionWeight.BEGINNER);
        RecipeBase.dodajRecept(Tost);
        Recipe Pasta = new Recipe("Pasta", PrescriptionWeight.MEDIUM);
        RecipeBase.dodajRecept(Pasta);
        Recipe Omlet = new Recipe("Omlet",PrescriptionWeight.EASY);
        RecipeBase.dodajRecept(Omlet);
        Recipe Sarma = new Recipe("Sarma", PrescriptionWeight.PRO);
        RecipeBase.dodajRecept(Sarma);
        Recipe Torta = new Recipe("Torta",PrescriptionWeight.HARD);
        RecipeBase.dodajRecept(Torta);
        Recipe Riba = new Recipe("Riba", PrescriptionWeight.HARD);
        RecipeBase.dodajRecept(Riba);
        Recipe Rostilj = new Recipe("Rostilj",PrescriptionWeight.MEDIUM);
        RecipeBase.dodajRecept(Rostilj);
        Recipe Kolaci = new Recipe("Kolaci",PrescriptionWeight.HARD);
        RecipeBase.dodajRecept(Kolaci);

        RecipeBase.Recept(Palacinka);
        RecipeBase.Recept(Pica);
        RecipeBase.Recept(Tost);
        RecipeBase.Recept(Pasta);
        RecipeBase.Recept(Omlet);
        RecipeBase.Recept(Sarma);
        RecipeBase.Recept(Torta);
        RecipeBase.Recept(Riba);
        RecipeBase.Recept(Rostilj);
        RecipeBase.Recept(Kolaci);
    }
    private static void dodajRecept(Recipe jelo) {
    }
    public static boolean Moguci() {
        return true;
    }
    public static String ispisiRecept() {
        StringBuilder sb = new StringBuilder();
        for (String naziv : RecipeBase.recept.keySet()) {
            sb.append(naziv).append(RecipeBase.getRecept(naziv).getPrice());
        }
        return sb.toString();
    }
    public static Recipe getRecept(String naziv) {
        return recept.get(naziv);
    }
    public static String Sortirano(double procenat) {
        StringBuilder sb = new StringBuilder();
        for (Recipe recept : RecipeBase.recept.values()) {
            if (Fridge.MoguciSortirani(recept, procenat))
                sb.append(recept.getNaziv()).append(recept.getPrice());
        }
        return sb.toString();
    }
}
