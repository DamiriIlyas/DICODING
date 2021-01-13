package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List lo = new ArrayList(); //List tanpa type-parameter
        lo.add("lo - String 1"); //lo menampung object String
        lo.add(new Planet("Mercury", 0.06)); //lo menampung object planet
        
        for (Object o : lo) {
            Planet p = (Planet) o; //perlu type-casting dari object ke Planet
            p.print();
        }
        
        List<Planet> lp = new ArrayList(); // List dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); //1p menampung object Planet
        //lp.add("1p - String 1"); // berisi ini compile-error, 1p tidak diijinkan menampung object Strig
        lp.add(new Planet("Venus", 0.82));
        
        for (Planet p : lp) {
            p.print();
        }
    }
    
}
