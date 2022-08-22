import java.util.Scanner;

public class InverseTheNumber {

    // In inverse Number, digit will be position and position will be digit
    public static void main(String a[])
    {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int y = 1 ;
        int ans = 0;
        while( number > 0 )
        {
            int x = number % 10;
            ans += y * (int)Math.pow(10,x-1);
            number /= 10;
            y++;
        }

        System.out.println(ans);

    }
}
