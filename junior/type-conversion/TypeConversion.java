class TypeConversion {
    public static void main(String[] args) { 
        // Auto Type Conversion
        // byte < short < int < long < float < double
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("-----------------------------------------------------");
        // Explicit Type Conversion
        double d1 = 10.5;
        int i1 = (int)d1;
        System.out.println("double: " + d1);
        System.out.println("Int: " + i1);
        System.out.println("-----------------------------------------------------");
        // Type Conversion from int to char
        char c1 = 'a';
        int i2 = c1;
        System.out.println("char: " + c1);
        System.out.println("Int: " + i2);
        System.out.println("-----------------------------------------------------");
        // Type Conversion from char to int  
        char c2 = (char)i2;
        System.out.println("Int: " + i2);
        System.out.println("char: " + c2);
        System.out.println("-----------------------------------------------------");
        // Type Conversion from int to byte
        byte b1 = (byte)i2;
        System.out.println("Int: " + i2);
        System.out.println("byte: " + b1);
















    }
}