import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        first = first.replace(" ", "");
        second = second.replace(" ", "");
        System.out.println(first.equalsIgnoreCase(second) ? "true" : "false");
    }
}