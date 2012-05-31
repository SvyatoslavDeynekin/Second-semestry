package hw41;

public class Calculator {

    public Calculator(StackInterface stack) {
        this.stack = stack;
    }

    public void makeOperation(int value, char symbol) {
        int secondValue = stack.top();
        stack.pop();
        if (symbol == '+') {
            stack.push(secondValue + value);
        } else if (symbol == '-') {
            stack.push(secondValue - value);
        } else if (symbol == '*') {
            stack.push(secondValue * value);
        } else if (symbol == '/') {
            stack.push(secondValue / value);
        }
    }

    public void addNumber(char symbol) {
        int value = symbol - '0';
        stack.push(value);
    }

    public void getResult(char symbol) {
        int temp = stack.top();
        stack.pop();
        makeOperation(temp, symbol);
    }
    private StackInterface stack;
}
