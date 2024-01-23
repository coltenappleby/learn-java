import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String num = scanner.next();

        if(num.equals(new StringBuilder(num).reverse().toString())){
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}