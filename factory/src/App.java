import before.Client;
import full.IPhone11FullFactory;
import full.IPhoneFullFactory;
import full.IPhoneXFullFactory;
import half.IPhone11HalfFactory;
import half.IPhoneHalfFactory;
import half.IPhoneXHalfFactory;
import model.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        Client beforeClient = new Client();

        System.out.println("### Order in IPhones X Without Pattern ###");
        IPhone iphone = beforeClient.orderIPhone("X", "Standard");
        System.out.println(iphone);
        System.out.println("### Order in IPhones 11 Without Pattern ###");
        iphone = beforeClient.orderIPhone("11", "Standard");
        System.out.println(iphone);

        IPhoneFullFactory iPhoneFullFactory = new IPhoneXFullFactory();
        System.out.println("### Order in IPhones X With Full Pattern ###");
        iphone = iPhoneFullFactory.orderIPhone();
        System.out.println(iphone);

        iPhoneFullFactory = new IPhone11FullFactory();
        System.out.println("### Order in IPhones 11 With Full Pattern ###");
        iphone = iPhoneFullFactory.orderIPhone();
        System.out.println(iphone);

        IPhoneHalfFactory iPhoneHalfFactory = new IPhoneXHalfFactory();
        System.out.println("### Order in IPhones X With Half Pattern ###");
        iphone = iPhoneHalfFactory.orderIPhone("Standard");
        System.out.println(iphone);

        iPhoneHalfFactory = new IPhone11HalfFactory();
        System.out.println("### Order in IPhones 11 Pro With Half Pattern ###");
        iphone = iPhoneHalfFactory.orderIPhone("Hight");
        System.out.println(iphone);
    }
}
