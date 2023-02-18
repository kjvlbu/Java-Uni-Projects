import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String args[]) {

        String personPlay;     //User's play -- "R", "P", or "S"
        String computerPlay;   //Computer's play -- "R", "P", or "S"
        int computerInt;       //Randomly generated number used to determine
                               //computer's play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Enter your move, R, P or S: ");
        personPlay = scan.next();

        computerInt = generator.nextInt(2);

        switch (computerInt){
            case 0:
                   computerPlay = "R";
                   break;
            case 1:
                   computerPlay = "P";
                   break;
            case 2:
                   computerPlay = "S";
                   break;
            default:
                    computerPlay = "None";
                    break;
        }
        System.out.println("The Computer's play is: " + computerPlay);

        if (personPlay.equals(computerPlay)){
            System.out.println("It's a tie!");
        }
        else if(personPlay.equals("R")){
            if(computerPlay.equals("P")){
                System.out.println("Paper covers rock, Computer wins!");
            }
            if(computerPlay.equals("S")){
                System.out.println("Rock crushes scissors, Player wins!");
            }
        }
        else if(personPlay.equals("P")){
            if(computerPlay.equals("R")){
                System.out.println("Paper covers rock, Player wins!");
            }
            if(computerPlay.equals("S")){
                System.out.println("Scissors snip paper, Computer wins!");
            }
        }
        else if(personPlay.equals("S")){
            if(computerPlay.equals("R")){
                System.out.println("Rock crushes scissors, Computer wins!");
            }
            if(computerPlay.equals("P")){
                System.out.println("Scissors snip paper, Player wins!");
            }
        }

    }
}
