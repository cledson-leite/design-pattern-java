package model;

public class IPhoneX extends IPhone {

    @Override
    public void getHardware() {
       System.out.println("Hardware List:");
       System.out.println("\t- 5.8in Screen");
       System.out.println("\t- A11 Chipset");
       System.out.println("\t- 2gb RAM");
       System.out.println("\t- 128gb Memory");
    }
    
}
