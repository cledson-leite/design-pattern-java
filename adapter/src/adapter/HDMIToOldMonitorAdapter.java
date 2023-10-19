package adapter;

import device.OldMonitor;
import interfaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI{

    @Override
    public void sendSound(String sound) {
        System.out.println("Sorry, we don't  work with sound");
    }
    
}
