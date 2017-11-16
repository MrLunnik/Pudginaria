package main.java.models;
import java.util.Random;

public class Map {
    //Размер карты от 10х10 до 100х100. Квадрат. Рандомного размера.
    int min = 10; // Задать минимальный размер карты
    int max = 100; // Задать максимальный размер карты
    public int Size = new Random(System.currentTimeMillis()).nextInt(max - min) + min; // Размер
    int [] [] matrixMap = new int[Size] [Size]; // Создание карты

    //Сообщение о создании карты
    public void SizeMsg(){
        System.out.println("Создана карта размером: "+Size+"x"+Size);
    }

    GameObject testM[] = new GameObject[10];
    testM[0] = new Item();
    testM[0].Met("123");
}
