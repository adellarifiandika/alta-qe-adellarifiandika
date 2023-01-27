public class bilangan_prima {
    public static void main(String[] args)
    {
        System.out.println(primeNumber(11)); //true
        System.out.println(primeNumber(13)); //true
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(35)); //false
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
        }else {
            return false;
        }
    }
}
