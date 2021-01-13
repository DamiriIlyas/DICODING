package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class objectFile {
    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);
        
        // Buat directory
        file.mkdirs();
    }
}
