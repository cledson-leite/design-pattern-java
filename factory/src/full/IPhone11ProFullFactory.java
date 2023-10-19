package full;

import model.IPhone;
import model.IPhone11Pro;

public class IPhone11ProFullFactory extends IPhoneFullFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
    
}
