package half;

import model.IPhone;
import model.IPhoneX;
import model.IPhoneXMax;

public class IPhoneXHalfFactory extends IPhoneHalfFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level == "Standard") {
                return new IPhoneX();
            } else if (level == "Hight") {
                return new IPhoneXMax();
            } else {
                throw new RuntimeException("Available models: Standard or High");
            }
    }
    
}
