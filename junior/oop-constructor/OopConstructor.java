import constructorfooclass.FooClass;
class OopConstructor {
    public static void main(String[] args)
    {
        // Constructor
        FooClass foo = new FooClass(2);
        System.out.println(foo.getA());
        foo.setA(5);
        System.out.println(foo.getA());

        // Deep Copy
        FooClass foo2 = new FooClass(foo);
        System.out.println(foo2.getA());
        foo.setA(10);
        System.out.println(foo2.getA());

        // Shallow Copy
        FooClass foo3 = foo;
        System.out.println(foo3.getA());
        foo.setA(15);
        System.out.println(foo3.getA());
    }
}