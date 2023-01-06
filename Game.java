import java.util.Scanner;
public class Game {
    private String hidden;
    private String guess;
    private String hint;
    private Scanner kb;
    public static void main (String[] args) {
        Game game = new Game();
        game.run();
    }
    public void run(){
        System.out.println("Choose a word.") ;
        String hidden = kb.nextLine();
        while(hidden!= guess) {
            System.out.println("Guess a" + hidden.length() + " letter word.");
            String guess = kb.nextLine();

     if (substring.equals -1)
        System.out.println("*");
     if(substring > -1) {
       System.out.println("+");
     } else
         System.out.println(substring);
        }
    }
}
