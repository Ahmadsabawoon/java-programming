package practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {
        String str  = "abxyabc";
        int n = 1;
        String prefix = str.substring(0,n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));


















    }
}
