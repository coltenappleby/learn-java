import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int length = Integer.parseInt(scanner.next());
        int sum = 0;
        for(int i = 0; i < length; i++){
            int num = Integer.parseInt(scanner.next());
            if(num%6 == 0){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}