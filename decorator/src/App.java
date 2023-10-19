import decorator.DoubleDecorator;
import decorator.MilkDecorator;
import model.Drink;
import model.Express;
import model.Tea;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Order a Express");
        Drink drink = new Express();
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("------------------------");
        
        System.out.println("Order a Tea");
        drink = new Tea();
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("------------------------");
        
        System.out.println("Order a Lungo");
        drink = new DoubleDecorator(new Express());
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("------------------------");
        
        System.out.println("Order a Cafe au Lait");
        drink = new MilkDecorator(new Express());
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("------------------------");
        
        System.out.println("Order a English Tea");
        drink = new MilkDecorator(new Tea());
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("------------------------");
    }
}
