package ProjekatNedelja7.ProjekatKuhinja;

import java.util.Scanner;
public abstract class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static boolean Provera = false;
    public static void Meni() {
        RecipeBase.sviRecepti();
        IngredientsBase.namirnice();

        while (!Provera) {
            System.out.println("----- K U H I NJ A -----");
            System.out.println("1. --- Meni --- ");
            System.out.println("2. --- Omiljeni recepti ---");
            System.out.println("3. --- Frizider ---");
            System.out.println("0. --- Izlaz ---");
            String izbor = sc.nextLine();

            switch (izbor) {
                case "1" -> Main.MeniHrane();
                case "2" -> Main.omiljeniRecepti();
                case "3" -> Main.Frizider();
                case "0" -> {Main.Provera = true;
                    return;}
                default -> System.out.println("Unesite odgovarajuci broj");
            }
        }
    }
    private static Recipe omiljeniRecepti() {
        RecipeBase.Recept(omiljeniRecepti());
        return null;
    }
    static void MeniHrane() {
        RecipeBase.sviRecepti();
        while (true) {
            System.out.println("----- MENI -----");
            System.out.println(RecipeBase.ispisiRecept());

            System.out.println("1. --- Napravite jelo sa trenutnim namirnicama");
            System.out.println("0. --- Povratak");
            System.out.print("Izaberite opciju odgovarajucim brojem: ");
            String izbor = sc.nextLine();

            switch (izbor) {
                case "1" -> Main.MoguciRecepti();
                case "3" -> {}
                case "0" -> {return;}
                default -> System.out.println("Unesite odgovarajuci broj.");
            }
        }
    }
    static  void Frizider(){
        while (true) {
            System.out.println(Fridge.StaImaUFrizideru());
            System.out.println("1. --- Dodaj namirnice");
            System.out.println("2. --- Izbrisi namirnice");
            System.out.println("0. --- Nazad");
            System.out.print("Izaberite odgovarajucu opciju: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1" -> Main.uFrizider();
                case "2"-> Main.izFrizidera();
                case "0"-> {return;}
                default-> System.out.println("Unesite odgovarajuci broj");
            }
        }
    }
    static void uFrizider(){
        System.out.println(IngredientsBase.ispisiSastojak());
        System.out.print("Unesite naziv sastojka koji zelite da ubacite u frizider: ");
        String naziv = sc.nextLine();
        while(!IngredientsBase.hasSastojak(naziv)){
            System.out.print("Unesite naziv sastojka sa liste: ");
            naziv = sc.nextLine();
        }
        System.out.print("Unesite kolicinu koju zelite da dodate: ");
        double tezina = sc.nextDouble();
        Fridge.uFrizider(IngredientsBase.getSastojak(naziv),tezina);
    }
    static void izFrizidera(){
        System.out.print("Unesite naziv sastojka koji zelite da izbacite iz frizidera: ");
        String naziv = sc.nextLine();
        while(!IngredientsBase.hasSastojak(naziv)){
            System.out.print("Unesite naziv sastojka sa liste");
            naziv = sc.nextLine();
        }
        System.out.print("Unesite kolicinu koju zelite da izbacite: ");
        double tezina = sc.nextDouble();
        if (tezina != 0) {
            IngredientsBase.getSastojak(naziv);
        }
        Fridge.izFrizidera(IngredientsBase.getSastojak(naziv), tezina);
    }
    static void Napraviti(){

        System.out.print("Unesite naziv jela koje zelite da spremite: ");
        String naziv = sc.nextLine();

        if(Fridge.MoguciRecept(RecipeBase.getRecept(naziv))){
            Fridge.NapravitiJelo(RecipeBase.getRecept(naziv));
            System.out.println("Jelo je spremljeno.");
            return;
        }
        System.out.println("Nema dovoljne kolicine sastojaka.");
    }
    static void Soritrano(){

        System.out.print("Unesite naziv jela koje zelite da spremite: ");
        String naziv = sc.nextLine();

        if(Fridge.MoguciSortirani(RecipeBase.getRecept(naziv),50)){
            Fridge.NapravitiJelo(RecipeBase.getRecept(naziv).SortiraniRecepti());
            System.out.println("Jelo je spremljeno.");
            return;
        }
        System.out.println("Nema dovoljne kolicine sastojaka.");
    }
    static void MoguciRecepti(){
        System.out.println("----- R E C E P T I -----");
        System.out.println(RecipeBase.Moguci());
        System.out.println("1. --- Napravi jelo");
        System.out.println("2. --- Jela sa pola porcije");
        System.out.println("0. --- Nazad");
        String choice = sc.nextLine();

        switch (choice) {
            case "1"-> Main.Napraviti();
            case "2"-> Main.PolaPorcije();
            case "0"-> {}
            default-> System.out.println("Unesite odgovarajuci broj.");
        }
    }
    static void PolaPorcije(){
        System.out.println("--- JELA SA POLA PORCIJE ---");
        System.out.println(RecipeBase.Sortirano(50));
        System.out.println("1. --- Napravi jelo sa pola porcije");
        System.out.println("0. --- Nazad");
        String choice = sc.nextLine();

        switch (choice) {
            case "1"-> Main.Soritrano();
            case "0"-> {}
            default-> System.out.println("Unesite odgovarajuci broj");
        }
    }
}
