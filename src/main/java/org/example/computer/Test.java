package org.example.computer;

import org.example.computer.adapter.HdmiVgaAdapter;
import org.example.computer.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();

        // 1. Cas normal : implementations standard de VGA
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");

        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Bonjour");

        // 2. TV via l'adaptateur (composition)
        HdmiVgaAdapter adapter = new HdmiVgaAdapter();
        adapter.setHdmi(new Tv());
        uniteCentrale.setVga(adapter);
        uniteCentrale.print("Bonsoir TV");

        // 3. Super video projecteur : branchement direct via VGA
        uniteCentrale.setVga(new SuperVideoProjecteur());
        uniteCentrale.print("Bonsoir SVP via VGA");

        // 4. Super video projecteur : via l'adaptateur (HDMI)
        HdmiVgaAdapter adapter2 = new HdmiVgaAdapter();
        adapter2.setHdmi(new SuperVideoProjecteur());
        uniteCentrale.setVga(adapter2);
        uniteCentrale.print("Bonsoir SVP via HDMI");

        // 5. Adaptateur base sur l'heritage (deja lie a TV)
        uniteCentrale.setVga(new HdmiVgaAdapterH());
        uniteCentrale.print("Bonsoir TV via heritage");
    }
}