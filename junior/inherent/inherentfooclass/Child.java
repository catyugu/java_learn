package inherentfooclass;
import inherentfooclass.Parent;
public class Child extends Parent {
    int b;
    public Child() {
        super();
        this.b = 0;
    }
    public Child(int a) {
        super(a);
    }
    public Child(int a, int b) {
        super(a);
        this.b = b;
    }

    public Child(Parent parent) {
        super(parent);
        this.b = 0;
    }
    public Child(Child child) {
        super(child);
        this.b = child.b;
    }
    public int getB() {
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
}