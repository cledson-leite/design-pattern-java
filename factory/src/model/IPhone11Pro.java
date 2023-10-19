package model;

public class IPhone11Pro extends IPhone {

    @Override
    public void getHardware() {
       System.out.println("Hardware List:");
       System.out.println("\t- 6.8in Screen");
       System.out.println("\t- A13 Chipset");
       System.out.println("\t- 3gb RAM");
       System.out.println("\t- 256gb Memory");
    }
    
}
