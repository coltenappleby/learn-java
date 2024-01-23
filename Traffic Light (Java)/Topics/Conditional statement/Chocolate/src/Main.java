import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if (M * N < K) {
            System.out.println("NO");
        } else if (K==1 && (M != 1 || N != 1)){
            System.out.println("NO");
        } else if ((N*M) % K == 0) {
            System.out.println("YES");
        } else if ((N*M) % K == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}