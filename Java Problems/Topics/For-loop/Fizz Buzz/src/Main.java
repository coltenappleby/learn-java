import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        for(; a <=b; a++){
            if(a%3 == 0 && a%5 == 0){
                System.out.println("FizzBuzz");
            } else if (a%3 == 0) {
                System.out.println("Fizz");
            } else if (a%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }
    }
}