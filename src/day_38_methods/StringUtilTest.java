package day_38_methods;

import java.util.Locale;


/**
 * import all static methods. so that you can just call by method name, without classname
 */
import static day_38_methods.StringUtils.*;
public class StringUtilTest {
    public static void main(String[] args) {
                String userName = "";
                if(StringUtils.isNullOrEmpty(userName)) {
                    System.out.println("FAIL: Username cannot be null or empty");
                }

                System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
                System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
                System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));

                String word = "java";
                String revWord = StringUtils.reverse(word);
                System.out.println("Word = " + word);
                System.out.println("revWord = " + revWord);
            }
        }
