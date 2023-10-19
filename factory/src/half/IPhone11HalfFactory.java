package half;

import model.IPhone;
import model.IPhone11;
import model.IPhone11Pro;

public class IPhone11HalfFactory extends IPhoneHalfFactory {
@Override
    protected IPhone createIPhone(String level) {
        if (level == "Standard") {
                return new IPhone11();
            } else if (level == "Hight") {
                return new IPhone11Pro();
            } else {
                throw new RuntimeException("Available models: Standard or High");
            }
    }
    
}
