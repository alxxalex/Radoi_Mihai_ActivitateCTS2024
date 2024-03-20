package model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta{

    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;
    private Double gramaj;

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramaj) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramaj = gramaj;
        double suma = 0d;

       suma = compozitieMedicament.values().stream().reduce(suma, (a,b)->a+b);
//        compozitieMedicament.values().stream().mapToDouble(a->a).sum();
        System.out.println(suma + " " + gramaj);
        if(suma != gramaj){
            throw  new RuntimeException("Gramaj Incorect");
        }
    }

    private Reteta(){}

    @Override
    public AbstractReteta cloneaza() {
        Reteta reteta = new Reteta();
        reteta.numeMedicament = numeMedicament;
        reteta.compozitieMedicament = new HashMap<>();

        for(String key : compozitieMedicament.keySet()){
            reteta.compozitieMedicament.put(key,compozitieMedicament.get(key));
        }
        reteta.gramaj = gramaj;

        return  reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compozitieMedicament=").append(compozitieMedicament);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
