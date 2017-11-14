package main.java.models;

import java.util.Random;

public class Map {
    //Размер карты от 10х10 до 100х100. Квадрат. Рандомного размера.
    int min = 10; //Минимальный размер карты
    int max = 100; //Максимальный размер карты
    public int MapSize = new Random(System.currentTimeMillis()).nextInt(max - min) + min;
    int [] [] matrixMap = new int[MapSize] [MapSize];

    public void Size(){
        System.out.println("Создана карта размером: "+MapSize+"x"+MapSize);
    }
}
