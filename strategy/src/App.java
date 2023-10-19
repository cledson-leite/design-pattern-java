// import calc.after.AdditionStrategy;
// import calc.after.CalculatorAfter;
// import calc.after.DivitionStrategy;
// import calc.after.MultiplicationStrategy;
// import calc.after.SubtractionStrategy;
// import calc.before.Calculator;
import person.Person;
import person.eat.MeatFoodStrategy;
import person.eat.VeggieFoodStartegy;
import person.transport.AirplaneStrategy;
import person.transport.BikeStrategy;
import person.transport.CarStrategy;
import person.work.DeveloperStrategy;
import person.work.PilotStrategy;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("### Calculator without pattern ###");
        // Calculator calc = new Calculator(2, 2);
        // System.out.println(calc.getResult("+"));
        // System.out.println(calc.getResult("-"));
        // System.out.println(calc.getResult("*"));
        // System.out.println(calc.getResult("/"));
        // System.out.println("");
        // System.out.println("### Calculator with pattern ###");
        // CalculatorAfter calcAfter = new CalculatorAfter(2, 2);
        // System.out.println(calcAfter.getResult(new AdditionStrategy()));
        // System.out.println(calcAfter.getResult(new SubtractionStrategy()));
        // System.out.println(calcAfter.getResult(new MultiplicationStrategy()));
        // System.out.println(calcAfter.getResult(new DivitionStrategy()));

        System.out.println("### Strategy inherit ###");
        Person ademar = new Person("Ademar", new MeatFoodStrategy(), new CarStrategy(), new DeveloperStrategy());
        ademar.presentationYourself();
        System.out.println("=====================");
        Person enso = new Person("Enso", new VeggieFoodStartegy(), new BikeStrategy(), new DeveloperStrategy());
        enso.presentationYourself();
        System.out.println("=====================");
        Person oscar = new Person("Oscar", new MeatFoodStrategy(), new AirplaneStrategy(), new PilotStrategy());
        oscar.presentationYourself();
        

    }
}
