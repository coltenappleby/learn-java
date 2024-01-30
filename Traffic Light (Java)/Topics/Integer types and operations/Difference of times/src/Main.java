import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hr1 = scanner.nextInt();
        int mn1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int hr2 = scanner.nextInt();
        int mn2 = scanner.nextInt();
        int sec2 = scanner.nextInt();

        int hrs = (hr2-hr1)*60*60;
        int mins = (mn2-mn1)*60;
        int secs = (sec2-sec1);
        System.out.println(hrs+mins+secs);



    }
}