package guverneleLumii.main;

import guverneleLumii.model.Guvern;
import guverneleLumii.model.GuvernRegistry;

public class Main {
    public static void main(String[] args) {
        GuvernRegistry guvernRegistry = GuvernRegistry.getInstance();
        guvernRegistry.adaugaGuvern("Romania","Andrei",12);
        guvernRegistry.adaugaGuvern("Romania","Mihai",12);
        guvernRegistry.adaugaGuvern("Ungaria","Rares",14);

        System.out.println(guvernRegistry.getGuvern("Romania"));
        System.out.println(guvernRegistry.getGuvern("Ungaria"));

        guvernRegistry.getGuvern("Romania").setNumePrimMinistru("Tudor");
        System.out.println(guvernRegistry.getGuvern("Romania"));

    }
}
