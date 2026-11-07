class data {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;

        String magic = "===============Magic================";

        System.out.println("=======Method 1=========");
        System.out.println(magic);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        System.out.println("=======Method 2=========");
        System.out.println(magic);
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));

        System.out.println(
            "Addition: " + (a + b) + 
            "Subtraction: " + (a - b) +
            "Multiplication: " + (a * b) +
            "Division: " + (a / b) 
        );
    }
}