package org.example.computer;

public class VideoProjecteur implements Vga {
    @Override
    public void print(String message) {
        System.out.println("--- Video projecteur (VP) ---");
        System.out.println(message);
        System.out.println("-----------------------------");
    }
}