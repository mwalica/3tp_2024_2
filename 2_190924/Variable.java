public class Variable {

    public static void main(String[] args) {
        //deklaracja zmiennej
        int age;
        //inicjalizacja zmiennej
        age = 10;
        //deklaracja i inicjalizacja
        int myAge = 34;
        int num1, num2, num3;
        String firstName = "Jan", lastName = "Kowalski";
        int num10 = 87;
        int num20 = 233;
        //typ prosty - liczby całkowite
        //byte - 1B
        byte number1 = -128;
        System.out.println("byte zakres: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        //byte - 2B
        short number2 = 12000;
        System.out.println("short zakres: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
        //int - 4B
        int number3 = 2147483647;
        System.out.println("int zakres: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        //int - 8B
        long number4 = 2_147_483_647_345L;
        System.out.println("long zakres: " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
        //typ prosty liczby zmiennoprzecinkowe
        //double 8B, float 4B
        double number5 = 1.342432423263466534;
        float number6 = 1.342432423263466534F;
        System.out.println("double: " + number5);
        System.out.println("float: " + number6);
        double a = 0.3;
        double b = 0.2;
        System.out.println("a - b = " + (a - b));
        //typ prosty char
        char letterA = 'A';
        char codeA = 65;
        char hexA = 0x41;
        System.out.println(letterA == codeA);
        System.out.println(letterA == hexA);
        int hex = 0xFF;
        int bin = 0b101001;
        int oct = 027;
        System.out.println(hex + " " + bin + " " + oct);
        //typ prosty boolean - logiczny
        boolean state = 12 > 8;
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("state = " + state);

        //stałe
        final double PI = 3.1416;
        final float TAX = 1.22f;

        var number100 = 2345;
    }

}
