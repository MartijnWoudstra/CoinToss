package martijn.coin;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Martijn on 11-12-2015.
 */
public class Game {

    private Scanner scanner;
    private boolean isStopped;
    private Side HEADS = Side.HEADS;

    public Side getSide(){
        return HEADS;
    }

    public Game() {
        this.scanner = new Scanner(System.in);
    }

    public void play(){
        while(!isStopped){
            Side s = getInput();
            boolean isWinner = flipCoin(s);
            finalizeGame(isWinner);
        }
    }

    private Side getInput() {
        System.out.println("What is your guess? heads/tails");
        String a = this.scanner.nextLine();
        while(!(a.equalsIgnoreCase("heads") || a.equalsIgnoreCase("tails"))){
            System.out.println("Enter heads or tails");
            a = this.scanner.nextLine();
        }
        if(a.equalsIgnoreCase("heads")) return Side.HEADS;
        else return Side.TAILS;
    }

    public boolean flipCoin(Side side)
    {
        Random random = new Random();
        return random.nextInt(2) == side.getIntpresentation();
    }

    private void finalizeGame(boolean winner) {
        if (winner)
            System.out.println("YOU WON! Want to play again? yes/no");
        else
            System.out.println("you lost... Want to play again? yes/no");

        String s = scanner.nextLine();
        while (!(s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("no"))) {
            System.out.println("Enter yes or no");
        }
        if (s.equalsIgnoreCase("no")) isStopped = true;
    }

    public static void main(String[] args){
        Game game = new Game();
        game.play();
    }

    public int getNumberOfSides(){
        return 2;
    }
}
