package traffic;

import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the traffic management system!");
    System.out.println("Input the number of roads:");
    System.out.println("Input the interval:");
    String menu = "Menu: \n" +
            "1. Add road\n" +
            "2. Delete road\n" +
            "3. Open system\n" +
            "0. Quit";

    System.out.println(menu);

    String input = null;
    while(!Objects.equals(input, "0")){
      input = scanner.nextLine();
      System.out.println(input);
    }
  }
}