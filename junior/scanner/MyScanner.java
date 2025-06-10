class MyScanner {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Type your name: ");
        String name = sc.next();
        System.out.println("Hello " + name);
        System.out.print("Type your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        sc.close();
    }
}