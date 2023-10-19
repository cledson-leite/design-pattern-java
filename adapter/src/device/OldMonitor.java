package device;

import interfaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void sendImage(String image) {
        System.out.println(">>> This is your Image: " + image);
    }
    
}
