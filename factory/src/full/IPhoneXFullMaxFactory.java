package full;

import model.IPhone;
import model.IPhoneXMax;

public class IPhoneXFullMaxFactory extends IPhoneFullFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXMax();
    }
    
}
