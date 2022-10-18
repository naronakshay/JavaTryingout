import java.util.Scanner;
class Reverse
{
        public static void main(String[] args)
        {
		Scanner sc = new Scanner(System.in);
               	System.out.println("Enter the number");
                int number=sc.nextInt();
		int reverse=0;
                System.out.println("Given number is: "+number);
                while (number != 0)
                {
                        reverse = reverse * 10;
                        reverse =reverse + number%10;
                        number = number/10;
                }
                System.out.println("Reverse number is: "+reverse);
        }
}