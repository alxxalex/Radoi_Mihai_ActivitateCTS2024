package main;

import model.AbstractReteta;
import model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> ingrediente = new HashMap<>();
        ingrediente.put("1",3.0);
        ingrediente.put("2",12.2);
        ingrediente.put("3",10.3);
        Reteta reteta = new Reteta("Mig400",ingrediente,25.5);
        AbstractReteta reteta1 = reteta.cloneaza();

        System.out.println(reteta1);
    }
}