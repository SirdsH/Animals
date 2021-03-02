package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	try {
        BufferedReader br = new BufferedReader(new FileReader("animals.csv"));
        BufferedReader brtype = new BufferedReader(new FileReader("animals_types.csv"));
        String content = "";
        String nextLine = br.readLine();
        String typeLine = br.readLine();

        ArrayList<String> arr = new ArrayList<>();

        
    }catch (IOException e){
        System.out.println("Idk anymore");
    }
    }
}
