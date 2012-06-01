package control;
import java.lang.Math;


public class ComplexNumber extends Pair {

    public ComplexNumber(float a, float b) {
        super(a, b);
    }

    public ComplexNumber Multiplication1(ComplexNumber n2){
        return new ComplexNumber(a * n2.a - b * n2.b, a * n2.b + b * n2.a );
    }

    public double abs(){
        return Math.sqrt(a*a + b*b);
    }
}
