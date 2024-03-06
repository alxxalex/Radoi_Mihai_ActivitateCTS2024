package guverneleLumii.model;

import java.util.HashMap;
import java.util.Map;

public class GuvernRegistry {
    private Map<String,Guvern> guverneleLumii ;

    private static GuvernRegistry instanta;

    private GuvernRegistry() {
        this.guverneleLumii = new HashMap<>();
    }

    public synchronized static GuvernRegistry getInstance(){
        if(instanta == null){
            instanta = new GuvernRegistry();
        }
        return instanta;
    }

    public void adaugaGuvern(String numeTara, String numePrimMinistru, int nrGuvernatori){
        if(!guverneleLumii.containsKey(numeTara)){
        guverneleLumii.put(numeTara,new Guvern(numeTara,numePrimMinistru,nrGuvernatori));
        }
    }

    public Guvern getGuvern(String numeTara){
        return guverneleLumii.get(numeTara);
    }
}
