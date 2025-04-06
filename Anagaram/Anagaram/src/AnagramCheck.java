import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next().toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = sc.next().toLowerCase();
        sc.close();
        
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        System.out.println(Arrays.equals(a, b) ? "Anagrams" : "Not Anagrams");
    }
}