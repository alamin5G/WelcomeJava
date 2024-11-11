package Chapter_10;

public class WrapperClassMethods {
    public static void main(String[] args) {
        // Integer wrapper class methods
        Integer int1 = Integer.valueOf("123");
        Integer int2 = Integer.parseInt("456");
        int intPrimitive = int1.intValue();
        double intToDouble = int1.doubleValue();
        int maxInt = Integer.max(int1, int2);
        System.out.println("Integer values: " + int1 + ", " + int2);
        System.out.println("intPrimitive: " + intPrimitive);
        System.out.println("intToDouble: " + intToDouble);
        System.out.println("Maximum Integer: " + maxInt);

        // Boolean wrapper class methods
        Boolean bool1 = Boolean.valueOf("true");
        Boolean bool2 = Boolean.parseBoolean("false");
        boolean boolPrimitive = bool1.booleanValue();
        boolean compareBools = Boolean.compare(bool1, bool2) > 0;
        System.out.println("Boolean values: " + bool1 + ", " + bool2);
        System.out.println("boolPrimitive: " + boolPrimitive);
        System.out.println("Comparing Booleans: " + compareBools);

        // Character wrapper class methods
        Character char1 = 'A';
        char charPrimitive = char1.charValue();
        boolean isDigit = Character.isDigit(char1);
        boolean isLetter = Character.isLetter(char1);
        boolean isLowerCase = Character.isLowerCase(char1);
        boolean isUpperCase = Character.isUpperCase(char1);
        char toLowerCase = Character.toLowerCase(char1);
        char toUpperCase = Character.toUpperCase(char1);
        System.out.println("Character value: " + char1);
        System.out.println("charPrimitive: " + charPrimitive);
        System.out.println("Is Digit: " + isDigit);
        System.out.println("Is Letter: " + isLetter);
        System.out.println("Is LowerCase: " + isLowerCase);
        System.out.println("Is UpperCase: " + isUpperCase);
        System.out.println("To LowerCase: " + toLowerCase);
        System.out.println("To UpperCase: " + toUpperCase);

        // Long wrapper class methods
        Long long1 = Long.valueOf("123456789");
        Long long2 = Long.parseLong("987654321");
        long longPrimitive = long1.longValue();
        int longToInt = long1.intValue();
        System.out.println("Long values: " + long1 + ", " + long2);
        System.out.println("longPrimitive: " + longPrimitive);
        System.out.println("longToInt: " + longToInt);

        // Demonstrating general methods
        System.out.println("int1 equals int2: " + int1.equals(int2));
        System.out.println("int1 hashCode: " + int1.hashCode());
        System.out.println("Comparing int1 and int2: " + int1.compareTo(int2));
    }
}

