package ru.netology.graphics;

import ru.netology.graphics.image.ImageConverter;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;


public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new ImageConverter(); // Объект класса конвертера
        GServer server = new GServer(converter); // Объект сервера
        server.start(); // Запуск сервера

        // Вывод изображения на экран:
        String url = "https://i.ibb.co/6DYM05G/edu0.jpg";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }
}





