import java.util.*;

public class Task9 {

    public static int getCodeThroughStrings(String input1) {
        String[] words = input1.split(" ");
        int pin = 0;

  
        for (String word : words) {
            pin += word.length();
        }

     
        if (String.valueOf(pin).length() == 1)
            return pin;

     
        int pin2 = 0;
        String pinStr = String.valueOf(pin);

        for (int i = 0; i < pinStr.length(); i++) {
            pin2 += Character.getNumericValue(pinStr.charAt(i));
        }

        return pin2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(getCodeThroughStrings(input));

        sc.close();
    }
}
