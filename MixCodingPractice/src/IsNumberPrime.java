import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String h[])
    {
        Scanner sc = new Scanner(System.in);
        int number = (int)sc.nextInt();
        boolean flag = false;
        System.out.println(new IsNumberPrime().checkPrime(number));
    }

    private String checkPrime(int number)
    {
        boolean flag = false;

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        return flag ? number + " is not a prime number." : number + " is a prime number.";

    }
}
