import java.util.Arrays;

public class Decrypter {


    public static void main(String[] args){

    /*
    Accept a string of 4 Integers
    Replace each digit with n = (n + 10) -7 % 10
    Swap digit 1 and 3, 2 and 4. code[0] <-> [2], and [1] <-> [3].
    Print and return integer as a STRING.
    */

        String n = decrypt(args[0]);


    }

    public static String decrypt(String code)
    {
        int[] n = {0, 0, 0, 0};


        for (int i = 0; i < code.length(); i++)
        {
            n[i] = Character.getNumericValue(code.charAt(i));
        }


        for(int i=0; i<n.length; i++)  //perform decryption operation
        {
            n[i] = doMath(n[i]);
        }

        swapIndices(n);

        String decryptedValue  = concatArr(n);

        System.out.println(decryptedValue);
        return decryptedValue;
    }

    private static int doMath(int digit) {

        digit += 10;
        digit -= 7;
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

    public static String concatArr(int [] n) { //Concat int array into string

        String str = "";
        for (int i = 0; i < n.length; i++)
            str += (n[i]);
        return str;
    }
}

