import java.util.Scanner;

public class faktor_bilangan {
    public static void main(String[] args) {
        int bilangan, i;
        Scanner input = new Scanner(System.in);
        System.out.print("input bilangan  = ");
        bilangan = input.nextInt();

        for (i=1; i<=bilangan; i++)
        {
            if (bilangan % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
