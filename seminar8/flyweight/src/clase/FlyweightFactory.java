package clase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
    Map<String,Flywieght> listaClienti;

    public FlyweightFactory() {
        listaClienti = new HashMap<>();
    }

    public Flywieght getClient(String numarAsigurare, String nume){
        if(!listaClienti.containsKey(numarAsigurare)){
            listaClienti.put(numarAsigurare,new Client(nume,numarAsigurare));
        }
        return listaClienti.get(numarAsigurare);
    }
}
