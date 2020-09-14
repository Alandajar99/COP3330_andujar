import java.util.Scanner;
import java.util.Arrays;

public class Encrypter {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

    /*
    Accept a string of 4 Integers
    Replace each digit with n = (n + 7) % 10
    Swap digit 1 and 3, 2 and 4. code[0] <-> [2], and [1] <-> [3].
    Print and return integer as a STRING.
    */


       String n = encrypt(args[0]);
    }

    public static String encrypt(String code)
    {
        int[] n = {0, 0, 0, 0};


        for (int i = 0; i < code.length(); i++)
         {
            n[i] = Character.getNumericValue(code.charAt(i));
         }

        for(int i=0; i<n.length; i++) //perform encryption operation
         {
            n[i] = doMath(n[i]);
         }

        swapIndices(n);
        String encryptedValue  = concatArr(n);
        System.out.println(encryptedValue);
        return encryptedValue;

    }
    private static int doMath(int digit) {

        digit = (digit + 7);
        digit %= 10;
        return digit;
    }

    public static void swapIndices(int[] n){
        int temp = 0;

            temp = n[0];
            n[0] = n[2];
            n[2] = temp;

            temp = n[1];
            n[1] = n[3];
            n[3] = temp;
    }
    public static String concatArr(int [] n){

        String str = "";
        for(int i=0;i<n.length;i++)
        str += (n[i]);
        return str;
    }
}
