import java.util.*;

public class Palindrom {

    static String scan = new Scanner(System.in).nextLine();

    public static void main(String[] args) {
        if (scan.equals(new StringBuffer(scan).reverse().toString())) 
            System.out.println("Yes! Your word is a palindrome");
        else 
            System.out.println("Sorry, but your word is not a palindrome");
    }

}
