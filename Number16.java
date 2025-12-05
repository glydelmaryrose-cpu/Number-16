
/**
 * Write a description of class Number16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Number16
{
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = scanner.nextLine();
        int digitCount = num.length();
        System.out.println("Digits: " + digitCount);
        scanner.close();
    }
}
