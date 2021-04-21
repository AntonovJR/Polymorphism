package polymorphism.mathOperation;

public class MathOperation {

    public int add(int one, int two, int three, int four) {
        return one+two+three+four;
    }

    public int add(int i, int i1, int i2) {
        return i+i1+i2;
    }

    public int add(int i, int i1) {
        return i+i1;
    }
}
