//Can we create a short of datatype that is not creating new object, but actually adding in just original object?
//StringBuilder (It is separate datatype/separate class).
//This is mutable, and we can change and modify it.

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
