package calc.after;

public class CalculatorAfter {
    private int number1;
    private int number2;
    public CalculatorAfter(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getResult(OperationStrategy strategy) {
        return strategy.calculate(number1, number2);
    }
}
