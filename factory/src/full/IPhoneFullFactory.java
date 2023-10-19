package full;

import model.IPhone;

public abstract class IPhoneFullFactory {

    public IPhone orderIPhone() {
        IPhone device = createIPhone();
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    //factory method
    protected abstract IPhone createIPhone();

}
