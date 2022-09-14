package ProjekatNedelja7.ProjekatKuhinja;

import java.util.ArrayList;
public abstract class Fridge {
    private static final ArrayList<WeightedIngredient> sastojciUFrizideru = new ArrayList<>();
    public static void uFrizider(WeightedIngredient sastojak, double tezina){
        if(!sastojciUFrizideru.contains(sastojak)){
            sastojciUFrizideru.add(sastojak);
        }
        sastojak.dodajTezinu(tezina);
    }
    public static void izFrizidera(WeightedIngredient sastojak, double tezina){
        sastojciUFrizideru.remove(sastojak);
        sastojak.setTezina(0);
    }
    public static boolean MoguciRecept(Recipe recept){
        for(WeightedIngredient sastojak : recept.getIngredients().keySet()){
            if(recept.getIngredients().get(sastojak) > sastojak.getTezina()) {
                return false;
            }
        }
        return true;
    }
    public static boolean MoguciSortirani(Recipe recept, double procenat){
        for(WeightedIngredient ingredient : recept.getIngredients().keySet()){
            if((recept.getIngredients().get(sastojciUFrizideru)  > ingredient.getTezina())){
                return false;
            }
        }
        return true;
    }
    public static void NapravitiJelo(Recipe recept){
        if(Fridge.MoguciRecept(recept))
            for(WeightedIngredient ingredient : recept.getIngredients().keySet())
                ingredient.dodajTezinu(recept.getIngredients().get(ingredient));
        }
    public static String StaImaUFrizideru(){
        StringBuilder s = new StringBuilder();
        for(WeightedIngredient sastojak : sastojciUFrizideru){
            s.append(sastojak.getNaziv()).append(sastojak.getTezina());
        }
        return "U frizideru se nalazi: " + s;
    }
}
