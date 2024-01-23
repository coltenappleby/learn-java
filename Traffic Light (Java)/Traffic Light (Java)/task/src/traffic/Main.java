package traffic;

import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the traffic management system!");
    System.out.println("Input the number of roads:");
    int numRoads = scanner.nextInt();
    System.out.println("Input the interval:");
    int interval = scanner.nextInt();
    String menu = "Menu: \n" +
            "1. Add road\n" +
            "2. Delete road\n" +
            "3. Open system\n" +
            "0. Quit";



    while(true){
      System.out.println(menu);
      int input = scanner.nextInt();
      if(input == 0){
        System.out.println("Bye!");
        break;
      }
      if(input == 1){
        System.out.println("Road added");
      } else if (input == 2) {
        System.out.println("Road deleted");
      } else if (input == 3) {
        System.out.println("System opened");
      } else {
        System.out.println("Bye!");
        break;
      }
    }
  }
}