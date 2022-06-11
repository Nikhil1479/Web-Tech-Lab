public class Encrypt_Decrypt {
    public static void main(String[] args) {

        Do_Encrypt(1234);
        Do_Decrypt(1234);
    }

    public static void Do_Encrypt(int num)
    {
        int digit, encrypt =0;
        while (num != 0)
        {
            digit = num % 10;
            encrypt = encrypt * 10 + digit + Math.abs(9);
            num = num / 10;
        }
        System.out.println("Encrypted: " + reverse(encrypt));
    }

    public static void Do_Decrypt(int num)
    {
        int digit, encrypt =0;
        while (num != 0)
        {
            digit = num % 10;
            encrypt = encrypt * 10 + digit + 9;
            num = num / 10;
        }

        int decrypt =reverse(encrypt);
        int digit1, sum =0;
        while (decrypt != 0)
        {
            digit1 = decrypt % 10;
            sum = sum * 10 + digit1 + (9);
            decrypt = decrypt / 10;
        }
        System.out.println("Decrypted: " + reverse(sum));
    }

    public static int reverse(int encrypt)
    {
        int digit, rev = 0;

        while(encrypt != 0) {
            digit = encrypt % 10;
            rev = rev * 10 + digit;
            encrypt = encrypt / 10;
        }
        return rev;
    }
}