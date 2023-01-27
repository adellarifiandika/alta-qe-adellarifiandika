import java.util.Scanner;

public class bilangan_prima_inputanuser {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka = ");
        int number = input.nextInt();
        System.out.print(number + " " + primeNumber(number));

    }

    private static boolean primeNumber(int number)
    {
        int i, faktor = 0;

        for ( i=1; i<=number; i++)
        {
            if (number % i == 0)
            {
                faktor = faktor + 1;
            }
        }

        if(faktor == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
