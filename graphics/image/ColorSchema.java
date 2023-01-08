package ru.netology.graphics.image;



public class ColorSchema implements TextColorSchema {
    private char[] chars;

    public ColorSchema(char[] chars) {
        this.chars = chars;
    }

    @Override
    public char convert(int color) {
        return chars[color * chars.length / 256];

    }
}