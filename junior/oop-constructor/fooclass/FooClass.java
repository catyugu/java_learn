package fooclass;
public class FooClass {
    double a;
    // Non-parameterized constructor
    public FooClass() {
        a = 0;
    }
    // Parameterized constructor
    public FooClass(double a) {
        this.a = a;
    }
    // Copy constructor
    public FooClass(FooClass fooClass){
        this.a = fooClass.a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }

}