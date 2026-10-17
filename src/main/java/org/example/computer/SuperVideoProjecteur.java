package org.example.computer;

public class SuperVideoProjecteur implements Vga, Hdmi {
    @Override
    public void print(String message) {
        System.out.println("=== Super video projecteur via VGA ===");
        System.out.println(message);
    }

    @Override
    public void view(byte[] data) {
        System.out.println("=== Super video projecteur via HDMI ===");
        String message = new String(data);
        System.out.println(message);
    }
}