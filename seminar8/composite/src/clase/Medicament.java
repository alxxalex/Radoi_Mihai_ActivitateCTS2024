package clase;

import java.io.DataInputStream;

public class Medicament implements StructuraAbastracta {
    private double pret;
    private String numeMedicament;

    public Medicament(double pret, String numeMedicament) {
        this.pret = pret;
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void aduagareCategorie(StructuraAbastracta structuraAbastracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereCategorie(StructuraAbastracta structuraAbastracta) {
        throw new UnsupportedOperationException();

    }

    @Override
    public StructuraAbastracta getCategorie(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare + "Medicamentul cu numele " + numeMedicament + " are pretul " + pret);
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        pret -= pret * procentDiscount;
    }
}
