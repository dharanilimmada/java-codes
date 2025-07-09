public class DefaultValues {

    // Variable declarations with default values
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    // Method to print default values
    public void printDefaultValues() {
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: [" + charValue + "]"); // char will print as empty if not assigned
        System.out.println("boolean: " + booleanValue);
    }

    public static void main(String[] args) {
        DefaultValue obj = new DefaultValue();
        obj.printDefaultValues();
    }
}