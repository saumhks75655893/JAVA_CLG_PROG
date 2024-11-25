class Fraction {
    private int numerator, denominator;

    // Constructor to initialize numerator and denominator
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new ArithmeticException("Denominator cannot be zero.");
        int gcd = findGCD(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
        if (this.denominator < 0) { // Keep denominator positive
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Helper method to find GCD
    private int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    // Arithmetic operations
    public Fraction add(Fraction other) {
        return new Fraction(this.numerator * other.denominator + other.numerator * this.denominator,
                            this.denominator * other.denominator);
    }

    public Fraction subtract(Fraction other) {
        return new Fraction(this.numerator * other.denominator - other.numerator * this.denominator,
                            this.denominator * other.denominator);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) throw new ArithmeticException("Cannot divide by zero.");
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    // Display fraction
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(1, 2);
            Fraction f2 = new Fraction(3, 4);
            System.out.println("Fraction 1: " + f1);
            System.out.println("Fraction 2: " + f2);
            System.out.println("Sum: " + f1.add(f2));
            System.out.println("Difference: " + f1.subtract(f2));
            System.out.println("Product: " + f1.multiply(f2));
            System.out.println("Quotient: " + f1.divide(f2));
            new Fraction(1, 0); // Demonstrates exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
