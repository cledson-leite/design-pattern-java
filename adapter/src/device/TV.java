package device;

import interfaces.HDMI;

public class TV implements HDMI {

    @Override
    public void sendImage(String image) {
        System.out.println(">>> This is your Image: " + image);
    }

    @Override
    public void sendSound(String sound) {
        System.out.println(">>> This is your Sound: " + sound);
    }
    
}
