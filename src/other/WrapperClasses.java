package other;

import static java.lang.Integer.*;

public class WrapperClasses {
    public static void main(String[] args) {
        // primitive data type int
        int number1 = 1;

        // object -> wrapper class for the primitive data type int
        Integer number2 = 10;

        int minValue = Integer.MIN_VALUE; // -2^31
        int maxValue = Integer.MAX_VALUE; // 2^31 -1

        int compare = compare(number1, number2);
        System.out.println(compare); // -1

        int compareTo = number2.compareTo(number1);
        System.out.println(compareTo); // 1

        double doubleValue = number2.doubleValue();
        System.out.println(doubleValue); // 10.0

        double floatValue = number2.floatValue();
        System.out.println(floatValue); // 10.0

        int stringToInteger = parseInt("1");
        System.out.println(stringToInteger); // 1

        Integer intToInteger = valueOf(number1);
        System.out.println(intToInteger); // 1

        /* Wrapper classes exist for all primitive data types */
        byte byPrimitive = 100;
        Byte byClass = 100;

        short sPrimitive = 10000;
        Short sClass = 10000;

        int iPrimitive = 100000;
        Integer iClass = 100000;

        long lPrimitive = 9999999;
        Long lClass = 9999999L;

        float fPrimitive = 123.f;
        Float fClass = 123.f;

        double dPrimitive = 12.4;
        Double dClass = 12.4;

        boolean boPrimitive = true;
        Boolean boClass = true;

        char cPrimitive = 'C';
        Character cClass = 'C';
    }
}


