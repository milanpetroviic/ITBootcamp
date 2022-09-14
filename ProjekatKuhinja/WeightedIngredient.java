package ProjekatNedelja7.ProjekatKuhinja;

import java.util.Scanner;
public class WeightedIngredient extends Ingredient{
    private double tezina;
    private double cena;
    WeightedIngredient(String naziv,double cena){
        this.naziv = naziv;
        this.cena = cena;
        this.id = idBrojac++;
        IngredientsBase.dodajSastojak(this);
    }
    public static WeightedIngredient x() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ime sastojka: ");
        String naziv = sc.nextLine();

        System.out.print("Unesite cenu sastojka: ");
        double cena = sc.nextDouble();

        if (!IngredientsBase.hasSastojak(naziv)){
            return  new WeightedIngredient(naziv,cena);
        }
        IngredientsBase.getSastojak(naziv).setCena(cena);
        return IngredientsBase.getSastojak(naziv);
    }
    public void dodajTezinu(double tezina) {
        this.tezina += tezina;
        if (this.tezina < 0) {
            this.tezina = 0;
        }
    }
    public void setTezina(double tezina) {
        this.tezina = tezina;
    }
    public double getPrice(){
        return cena;
    }
    void setCena(double cena) {
        this.cena = cena;
    }
    public double getTezina() {
        return tezina;
    }
    @Override
    public String toString() {
        return  " Tezina:" + tezina + " Cena: " + cena + " Id:" + id + " Naziv" + naziv;
    }
    public void put(String naziv, WeightedIngredient sastojak) {
    }
}
