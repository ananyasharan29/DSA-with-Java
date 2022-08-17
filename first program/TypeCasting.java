import java.util.Scanner;

//When one type of data is assigned to another type of variable then automatic type conversion will take place
// if the following conditions are met :-
//Condition 1: The two types should be compatible like float with integer and character with String
//Condition 2: The destination type should be greater than the source type like float is greater than integer(in integer we can only add integer value but in float we can add integer as well as decimal value)

 public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num = input.nextFloat();
        //System.out.println(num);

        //How can we convert integer value to float value?
        //That is called type casting (Casting in compatible type)

        //Type Casting - compressing a bigger number in a smaller type explicitly
        int num = (int)(35.33f);
        System.out.println(num);

        //automatic type promotion in expressions
 //       int a = 257;
 //       byte b = (byte)(a); // 257 % 256 = 1 (byte range is 256)
 //       System.out.println(b);

 //       byte a = 40;
 //       byte b = 50;
 //       byte c = 100;
 //       int d = (a*b) / c;
 //       System.out.println(d);

 //       byte b = 50;
 //       b = b * 2;
        //whenever you are doing byte evaluations automatically it converts into integer then this will become integer
        // so how can we assigned it to byte, you can't do it.

        int number = 'A'; //again automatic type conversion in Ascii value
        System.out.println(number);

        //Java follows the unicode principles means all the characters and all the languages you can print
        System.out.println("नमस्ते");
        System.out.println("こんにちは");


//Type promotion rules are as follows
        //1.All the byte, short and character values are promoted to integer then
            //if one of the operands is long then the whole operation promoted in the long
            //if it is float the whole operation promoted in float
            //if it is double the whole operation promoted in double

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        //float + int -double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


    }
}
//     1. Widening Casting (automatically) - converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double
//        Widening casting is done automatically when passing a smaller size type to a larger size type.


//     2. Narrowing Casting (manually) - converting a larger type to a smaller size type
//        double -> float -> long -> int -> char -> short -> byte
//        Narrowing casting must be done manually by placing the type in parentheses in front of the value.
















