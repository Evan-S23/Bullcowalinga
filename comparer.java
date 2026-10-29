package Bullcowalinga;

public class comparer {
    public static boolean compare(String guess, String target,GuessChecker z){
    String bank = target;
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String[] wordle = new String[guess.length()];
    for(int i = 0; i < guess.length(); i++){
        if(guess.charAt(i) == target.charAt(i)){
            wordle[i] = GREEN + "X" + RESET;
            bank = bank.replaceFirst(target.charAt(i)+"", "");
        }
    }
    for(int i = 0; i < guess.length(); i++){
        for(int j = 0; j < guess.length(); j++){
        if(guess.charAt(i) == target.charAt(j) && bank.contains(target.charAt(j)+"") && wordle[i] == null){
            wordle[i] = YELLOW + "X" + RESET;
            break;
        }
        else if(guess.charAt(i) != target.charAt(j) && j == guess.length() - 1 && wordle[i] == null){
            wordle[i] = RED + "X" + RESET;
            break;
        }
        }
    }
    System.out.println(String.join("", wordle));
    if(guess.equals(target)){
        return true;
    }
    return false;
    }
}
