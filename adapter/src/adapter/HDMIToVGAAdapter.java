package adapter;

import interfaces.HDMI;
import interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Connecting the HDMI/VGA adapter ...");
        this.vga = vga;
    }

    @Override
    public void sendImage(String image) {
        System.out.println("Converting the image from HDMI to VGA ...");
        vga.sendImage(image);
    }

    @Override
    public void sendSound(String sound) {
        System.out.println("Sorry, we don't  work with sound");
    }
    
}
