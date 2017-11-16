package main.java;

import main.java.models.hero.HeroType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name, hero: ");

        String heroName = br.readLine();
        System.out.println("Welcome, " + heroName + "!");

        System.out.print("Choose your class: ");
        HeroType heroType = HeroType.valueOf(br.readLine());
        System.out.println("Your class is: " + heroType + "!");


        Hero hero = new Hero(heroName, heroType);
        System.out.println("Welcome to Pudginaria, hero!");
        System.out.println("Your hero is: " + hero);



    }
}



