import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        System.out.println(num);
        for(int k = 0; k < 10; k++){
//            System.out.println(num);
            num += n;
            if( num == 100 && n == 20){
                System.out.println(num);
            }
            if(num > 101){
                break;
            }
            if(isPerfectSquare(num)) {
                continue;
            }
            if(num == 90){
                continue;
            }
            System.out.println(num);

        }

    }

    // Declare a function to check if a number is perfect square or not
    public static boolean isPerfectSquare(int number) {
//        brute force
//        TODO: This doesn't work
        for(int i = 2; i <= 10; i++){
//            System.out.println(number/i);
            int temp = number / i;
            if(temp*temp == number){
                return true;
            }
        }
        return false;
    }
}