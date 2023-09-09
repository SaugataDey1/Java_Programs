import java.util.Random;
import java.util.Scanner;
public class exercise_1
{
    public static void main(String[] args)
    {
        Game g = new Game();
        boolean b=false;
        while (!b)
        {
            System.out.println(g.takeUserInput());
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}

class Game
{
    public int number;
    public int NoOfGuesses=0;
    public int inputNumber;

    /*
    public int getNoOfGuesses() {
        return NoOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        NoOfGuesses = noOfGuesses;
    }
    */

    Game()
    {
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    int takeUserInput()
    {
        System.out.println("Guess the Number...");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }

    boolean isCorrectNumber()
    {
        NoOfGuesses++;

        if(inputNumber==number)
        {
            System.out.format("Yes, You guessed it RIGHT in : " + NoOfGuesses + " Correct Attempts.");
            return true;
        }
        else if (inputNumber<number)
        {
            System.out.println("Too Low...");
        } else if (inputNumber>number)
        {
            System.out.println("Too High...");
        }

        return false;
    }
}
