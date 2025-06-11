package inherentfooclass;
public class Parent {
    int a;
    public void setA(int a)
    {
        this.a = a;
    }
    public int getA()
    {
        return a;
    }
    public Parent(){
        this.a = 0;
    }
    public Parent(int a)
    {
        this.a = a;
    }
    public Parent(Parent parent)
    {
        this.a = parent.a;
    }
}