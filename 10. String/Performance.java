public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            series = series + ch;  //series += ch
        }
        System.out.println(series);
    }
}
//If you want to add n characters in string,then you need to create new object
// because we know strings are immutable that's why its time complexity is O(N^2).