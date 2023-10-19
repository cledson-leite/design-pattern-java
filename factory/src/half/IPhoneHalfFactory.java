package half;

import model.IPhone;

public abstract class IPhoneHalfFactory {

    public IPhone orderIPhone(String level) {
        IPhone device = createIPhone(level);
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    //factory method
    protected abstract IPhone createIPhone(String level);

}
