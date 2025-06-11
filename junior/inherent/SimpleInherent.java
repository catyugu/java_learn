import inherentfooclass.Child;
class SimpleInherent {
    public static void main(String[] args) {
        Child child = new Child(5,6);
        System.out.println(child.getA());
        System.out.println(child.getB());
        child.setA(10);
        child.setB(20);
        System.out.println(child.getA());
        System.out.println(child.getB());
    }
}