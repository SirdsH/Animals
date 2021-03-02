package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> arr = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("animals.csv"));
            String content = "";
            String nextLine = br.readLine();
            while (nextLine != null) {
                String[] raw = nextLine.split(";");
                Animal animal = new Animal();
                animal.id = Integer.parseInt(raw[0]);
                animal.type = Integer.parseInt(raw[1]);
                animal.name = raw[2];
                animal.age = Integer.parseInt(raw[3]);
                animal.gender = raw[4];
                animal.isagresive = raw[5];
                animal.isfriendly = raw[6];
                arr.add(animal);
                nextLine = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Idk anymore");
        }
    }
}
