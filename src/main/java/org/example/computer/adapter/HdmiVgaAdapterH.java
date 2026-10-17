package org.example.computer.adapter;

import org.example.computer.Tv;
import org.example.computer.Vga;

public class HdmiVgaAdapterH extends Tv implements Vga {
        @Override
        public void print(String message) {
            System.out.println("Adaptateur (heritage) : adaptation de l'appel print vers view");
            byte[] data = message.getBytes();
            super.view(data);
        }
    }

