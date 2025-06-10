class Float{
    public static void main(String[] args) {
        // Declare a float variable
        // The range of float is approximately 1.4E-45 to 3.4E+38
        float myFloat = 5.75f;

        // Print the float variable
        System.out.println("The value of myFloat is: " + myFloat);

        // Declare a double variable
        // The range of double is approximately 4.9E-324 to 1.7E+308
        double myDouble = 19.99;

        // Print the double variable
        System.out.println("The value of myDouble is: " + myDouble);

        double myFloat1 = 5.1211;
        double myFloat2 = 5.1211001;
        System.out.println("myFloat1 equals myFloat2?" + (myFloat1==myFloat2));

        System.out.println("myFloat1 equals myFloat2 in tolerance 1e-5?" + (Math.abs(myFloat1-myFloat2)<1e-5));

    }
}