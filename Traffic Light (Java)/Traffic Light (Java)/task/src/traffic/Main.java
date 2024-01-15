package traffic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){

    List<String> options = new ArrayList<>();
    options.add("1. Add");
    options.add("2. Delete");
    options.add("3. System");
    options.add("0. Quit");

    System.out.println("Welcome to the traffic management system!");
    System.out.println("Menu:");
    for (String option : options) {
      System.out.println(option);
    }
  }
}
