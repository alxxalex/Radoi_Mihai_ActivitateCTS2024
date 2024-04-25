package program;

import clase.Card;
import clase.Cash;
import clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ion");
        client.realizeazaPlata(100);
        client.setModPlata(new Cash());
        client.realizeazaPlata(50);


    }
}
