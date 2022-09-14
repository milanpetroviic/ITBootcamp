package ProjekatNedelja7.ProjekatKuhinja;
import java.util.HashMap;
public abstract class IngredientsBase {
    private static final HashMap <String, WeightedIngredient>  sastojak = new HashMap<>();
    static void dodajSastojak(WeightedIngredient sastojak) {
        sastojak.put(sastojak.getNaziv(), sastojak);
    }
    public static boolean hasSastojak(String naziv) {
        return sastojak.containsKey(naziv);
    }
    public static WeightedIngredient getSastojak(String naziv) {
        return sastojak.get(naziv);
    }
    public static String ispisiSastojak() {
        StringBuilder sb = new StringBuilder();
        for (String naziv : IngredientsBase.sastojak.keySet()) {
            sb.append(naziv);
        }
        return sb.toString();
    }
    public static void namirnice() {
        sastojak.put("Brasno", new WeightedIngredient("Brasno", 1000));
        sastojak.put("Jaje", new WeightedIngredient("Jaje", 10));
        sastojak.put("Ulje", new WeightedIngredient("Ulje", 200));
        sastojak.put("Mleko", new WeightedIngredient("Mleko", 150));
        sastojak.put("So", new WeightedIngredient("So", 100));
        sastojak.put("Secer", new WeightedIngredient("Secer", 100));
        sastojak.put("Krem", new WeightedIngredient("Krem", 700));
        sastojak.put("Plazma", new WeightedIngredient("Plazma", 500));
        sastojak.put("Kvasac", new WeightedIngredient("Kvasac", 100));
        sastojak.put("Paradajz", new WeightedIngredient("Paradajz", 100));
        sastojak.put("Origano", new WeightedIngredient("Origano", 80));
        sastojak.put("Pecenica", new WeightedIngredient("Pecenica", 550));
        sastojak.put("Kobasica", new WeightedIngredient("Kobasica", 500));
        sastojak.put("Sir", new WeightedIngredient("Sir", 600));
        sastojak.put("Prsuta", new WeightedIngredient("Prsuta", 1500));

        for (WeightedIngredient ingredient : IngredientsBase.sastojak.values()) {
            Fridge.uFrizider(ingredient, 1);
        }
    }
}
