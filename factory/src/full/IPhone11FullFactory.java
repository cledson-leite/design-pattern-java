package full;

import model.IPhone;
import model.IPhone11;

public class IPhone11FullFactory extends IPhoneFullFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
    
}
