package model;

public class IPhone11 extends IPhone {

    @Override
    public void getHardware() {
       System.out.println("Hardware List:");
       System.out.println("\t- 6.8in Screen");
       System.out.println("\t- A13 Chipset");
       System.out.println("\t- 2gb RAM");
       System.out.println("\t- 128gb Memory");
    }
    
}
