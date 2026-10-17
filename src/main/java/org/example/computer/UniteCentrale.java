package org.example.computer;

public class UniteCentrale {
    private Vga vga;

    public void print(String message) {
        System.out.println("Unite centrale : " + message);
        vga.print(message);
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}