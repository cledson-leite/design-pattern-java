package before;

import model.IPhone;
import model.IPhone11;
import model.IPhone11Pro;
import model.IPhoneX;
import model.IPhoneXMax;

public class Client {
    public IPhone orderIPhone(String generate, String level) {
        IPhone device = null;
        if (generate == "X") {
            if (level == "Standard") {
                device = new IPhoneX();
            } else if (level == "Hight") {
                device = new IPhoneXMax();
            } else {
                throw new RuntimeException("Available models: Standard or High");
            }
        } else if (generate == "11") {
            if (level == "Standard") {
                device = new IPhone11();
            } else if (level == "Hight") {
                device = new IPhone11Pro();
            } else {
                throw new RuntimeException("Available models: Standard or High");
            }
        } else {
             throw new RuntimeException("Available generations: X or 11");
        }
        
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
