package Bullcowalinga;
import java.util.Scanner;
public class GuessChecker{
  String number;
  String input;
  public void update(String j){number = j;}
  public void create(String j){input = j;}
  static Scanner sc = new Scanner(System.in);
	public void run(GuessChecker z){
    boolean victory = false;
    boolean pass = false;
    int targetNumber =34;
    while(!pass){
      targetNumber = (int)(Math.random()*10000);
      pass = allDiff.check(""+targetNumber,z,false);
    }
    System.out.println("Your task is to guess a 4 digit number. \n The number is between 0000 and 9999.\n Inputs of three digits or less are automatically converted to four digits.");
    int guesses = 0;
    while(!victory){
    System.out.print("Input your guess: ");
    String test = sc.next();
    pass = false;
    while(!pass){
      pass = allDiff.check(test,z,true);
      if(!pass){
      System.out.print("Input a valid guess(between 0 and 9999): ");
      test = sc.next();
      }
    }
    victory = comparer.compare(input, number, z);
    guesses++;
    }
    System.out.println("Congratulations! You guessed the correct number in " + guesses + " guesses.");
    sc.close();
  }
}
