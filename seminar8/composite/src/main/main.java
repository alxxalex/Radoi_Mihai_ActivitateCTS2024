package main;

import clase.Categorie;
import clase.Medicament;
import clase.StructuraAbastracta;

public class main {
    public static void main(String[] args) {
        StructuraAbastracta medicamente = new Categorie(0d,"Medicament");
        StructuraAbastracta raceala = new Categorie(0.1,"Raceala");
        StructuraAbastracta durere = new Categorie(0.1,"Durere");

        StructuraAbastracta copil = new Categorie(0.3,"Copil");
        StructuraAbastracta adult = new Categorie(0.2,"Adult");

        StructuraAbastracta nurofen = new Medicament(12.2,"Nurofen");
        StructuraAbastracta paracetamol = new Medicament(22.2,"Paracetamol");

        medicamente.aduagareCategorie(raceala);
        medicamente.aduagareCategorie(durere);

        raceala.aduagareCategorie(copil);
        raceala.aduagareCategorie(adult);

        adult.aduagareCategorie(nurofen);
        copil.aduagareCategorie(nurofen);
        raceala.aduagareCategorie(paracetamol);

        medicamente.afisareProspect("  ");
        medicamente.calculeazaPret(0.2);
        medicamente.afisareProspect("        ");
    }
}
