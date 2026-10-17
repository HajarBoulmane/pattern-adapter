package org.example.computer;


public class Tv implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("### TV (HDMI) ###");
        String message = new String(data);
        System.out.println(message);
        System.out.println("#################");
    }
}