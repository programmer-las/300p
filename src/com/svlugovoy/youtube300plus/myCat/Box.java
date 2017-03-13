package com.svlugovoy.youtube300plus.myCat;

/**
 * Created by a on 07.03.2017.
 */
public class Box {
    int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки

    // Конструктор
    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    // вычисляем объём коробки
    int getVolume() {
        return width * height * depth;
    }
}