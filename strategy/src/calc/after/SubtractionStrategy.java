package calc.after;

public class SubtractionStrategy implements OperationStrategy{

    @Override
    public int calculate(int number1, int number2) {
        return number1 - number2;
    }
    
}
