package full;

import model.IPhone;
import model.IPhoneX;

public class IPhoneXFullFactory extends IPhoneFullFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
    
}
