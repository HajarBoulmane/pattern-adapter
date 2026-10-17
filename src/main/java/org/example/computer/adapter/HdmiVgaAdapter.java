package org.example.computer.adapter;

import org.example.computer.Hdmi;
import org.example.computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("Adaptateur (composition) : adaptation de l'appel print vers view");
        byte[] data = message.getBytes();
        hdmi.view(data);
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}