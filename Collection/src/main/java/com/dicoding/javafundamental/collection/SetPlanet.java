package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    
    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan object ke set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan object "earth" beberapa kalo
        planets.add("earth");
        planets.add("mars"); //object bisa terus ditambahakan ke Set
        
        
        //method size() untuk mendapatkan ukuran Set
        System.out.println("set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t" + planet);
        }
        
        planets.remove("venus"); // method remove() untuk mengeluarkan object dari Set
        
        System.out.println("set planets akhir : (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        } 
    }
}
