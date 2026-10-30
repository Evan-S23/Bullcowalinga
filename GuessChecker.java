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
    int digits = 4;
    System.out.print("Input the number of digits you wish to play with: ");
    while(!pass){
      try{
        digits = Integer.parseInt(sc.next());
        if(digits>0 && digits<=15){
          pass = true;
        }
        else{
          System.out.print("Input a valid number of digits: ");
        }
      }
      catch(NumberFormatException e){
        System.out.print("Input a valid number of digits: ");
      }
    }
    System.out.println("Your task is to guess a " + digits + " digit number. \n The number is between " + 
    String.format("%0" + digits + "d", 0) + " and " + String.format("%0" + digits + "d", (int)(Math.pow(10,digits)-1)) + 
    ".\n Inputs of " + (digits-1) + " digits or less are automatically converted to " + digits + " digits.");
    pass = false;
    while(!pass){
      targetNumber = (int)(Math.random()*Math.pow(10,digits));
      pass = allDiff.check(""+targetNumber,z,false,digits);
    }
    
    int guesses = 0;
    while(!victory){
    System.out.print("Input your guess: ");
    String test = sc.next();
    pass = false;
    while(!pass){
      pass = allDiff.check(test,z,true,digits);
      if(!pass){
      System.out.print("Input a valid guess(between 0 and " + (int)(Math.pow(10,digits)-1) + "): ");
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
