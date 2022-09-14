package ProjekatNedelja7.ProjekatKuhinja;

public abstract class Ingredient implements Prieceable {
    int id;
    static int idBrojac = 0;
    String naziv;
    public String getNaziv(){
        return this.naziv;
    }

}
