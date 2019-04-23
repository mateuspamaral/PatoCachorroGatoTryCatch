package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animais = new ArrayList<>();

        animais.add("Pato");
        animais.add("Cachorro");
        animais.add("Gato");

        try {
            System.out.println(animais.get(5));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
