package string_dsa;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your string:");
        String string = scanner.next();
        String reverse = " ";
        for (int index = string.length() -1; index >= 0; index --){
            reverse = reverse + string.charAt(index);
        }
        System.out.println(reverse);
    }
}

//  input-:lunedi
//          idenul