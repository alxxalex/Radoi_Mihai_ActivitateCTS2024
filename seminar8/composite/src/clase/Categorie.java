package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbastracta{
    private List<StructuraAbastracta> medicamente;
    private double procentReducere;
    private String denumire;

    public Categorie(double procentReducere, String denumire) {
        this.procentReducere = procentReducere;
        this.denumire = denumire;
        medicamente = new ArrayList<>();
    }

    public double getProcentReducere() {
        return procentReducere;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void aduagareCategorie(StructuraAbastracta structuraAbastracta) {
        medicamente.add(structuraAbastracta);
    }

    @Override
    public void stergereCategorie(StructuraAbastracta structuraAbastracta) {
        medicamente.remove(structuraAbastracta);
    }

    @Override
    public StructuraAbastracta getCategorie(int index) {
        return medicamente.get(index);
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println( indentare +"Categoria cu numele " + denumire + " are urmatoarele subcategorii: ");
        for(var subCateg: medicamente){
            subCateg.afisareProspect(indentare);
        }
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        for(var subCateg: medicamente){
            subCateg.calculeazaPret(procentDiscount);
        }
    }
}
