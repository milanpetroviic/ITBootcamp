package ProjekatNedelja7.ProjekatKuhinja;

import java.util.HashMap;
public class Recipe implements Prieceable{
    private final String naziv;
    private final PrescriptionWeight slozenost;
    private final HashMap<WeightedIngredient,Double> sastojci;
    Recipe(String naziv, PrescriptionWeight slozenost){
        this.naziv = naziv;
        this.slozenost = slozenost;
        this.sastojci =  new HashMap<>();
    }
    void dodajSastojak(String naziv, double tezina){
        if(IngredientsBase.hasSastojak(naziv))
            this.sastojci.put(IngredientsBase.getSastojak(naziv),tezina);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Ingredient sastojak : this.sastojci.keySet())
            sb.append(sastojak.getNaziv()).append(this.sastojci.get(sastojak));
        return sb.toString();
    }
    public String getNaziv() {
        return naziv;
    }
    public PrescriptionWeight getSlozenost() {
        return slozenost;
    }
    public double getPrice() {
        double cena = 0;
        for (Ingredient sastojak : this.sastojci.keySet()) {
            cena += sastojak.getPrice() * this.sastojci.get(sastojak);
        }
        return cena;
    }
    Recipe SortiraniRecepti(){
        Recipe sortirani = new Recipe(this.naziv + (double) 50 + "%", this.slozenost);
        for(Ingredient ingredient: this.sastojci.keySet()){
            sortirani.dodajSastojak(ingredient.getNaziv(),this.sastojci.get(ingredient));
        }
        return sortirani;
    }
    public HashMap<WeightedIngredient, Double> getIngredients() {
        return sastojci;
    }
}
