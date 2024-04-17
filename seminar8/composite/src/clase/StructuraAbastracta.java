package clase;

public interface StructuraAbastracta {
    void aduagareCategorie(StructuraAbastracta structuraAbastracta);
    void stergereCategorie(StructuraAbastracta  structuraAbastracta);
    StructuraAbastracta getCategorie(int index);
    void afisareProspect(String indentare);
    void calculeazaPret(double procentDiscount);
}
