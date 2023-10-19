import adapter.HDMIToOldMonitorAdapter;
import adapter.HDMIToVGAAdapter;
import device.Computer;
import device.OldMonitor;
import device.TV;
import interfaces.HDMI;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("### Object Adapter ###");
        Computer computer = new Computer();
        OldMonitor monitor = new OldMonitor();
        TV tv = new TV();

        computer.connectPort(tv);
        computer.sendImageAndSound("Angry dog", "Dog bark");
        computer.connectPort(new HDMIToVGAAdapter(monitor));
        computer.sendImageAndSound("Cat and Rainbow", "Cat song");
       
        System.out.println("### Class Adapter ###");
        computer = new Computer();
        monitor = new HDMIToOldMonitorAdapter();

        computer.connectPort((HDMI) monitor);
        computer.sendImageAndSound("Cat and Rainbow", "Cat song");
    }
}
