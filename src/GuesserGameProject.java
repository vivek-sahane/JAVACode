import java.util.Scanner;
/*
    Basic Nested if else JAVA project Using different classes
 */
class Guesser{
    int Guessernum;

    public int takeNumberGuesser(){
        System.out.println("Guesser guess a Number");
        Scanner sc = new Scanner(System.in);
        Guessernum=sc.nextInt();
        return Guessernum;
    }
}

class Player{
    int playernum;
    public int takeNumberPlayer(){
        System.out.println("Player guess a Number");
        Scanner sc = new Scanner(System.in);
        playernum=sc.nextInt();
        return playernum;
    }
}

class Umpire{
    int numfromGuesser ;
    int numfromPlayer1 ;
    int numfromPlayer2 ;
    int numfromPlayer3 ;

    void CollectfromGuesser(){
        Guesser g=new Guesser();
        numfromGuesser=g.takeNumberGuesser();
    }
    void CollectfromPlayer(){
        Player P1 = new Player();
        numfromPlayer1=P1.takeNumberPlayer();

        Player P2 = new Player();
        numfromPlayer2=P2.takeNumberPlayer();

        Player P3 = new Player();
        numfromPlayer3=P3.takeNumberPlayer();
    }
    void compare(){
        if(numfromPlayer1==numfromGuesser){
            if(numfromPlayer2==numfromGuesser && numfromPlayer3==numfromGuesser){
                System.out.println("All players won the game");
            }
            else if(numfromPlayer2==numfromGuesser){
                System.out.println("only Player1 and Player2 won the game");
            }
            else if(numfromPlayer3==numfromGuesser){
                System.out.println("only Player 1 and Player 3 won the game");
            }
            else{
                System.out.println("Player1 won the game");
            }
        }
        else if(numfromPlayer2==numfromGuesser){
            if(numfromPlayer3==numfromGuesser){
                System.out.println("Only Player2 and Player3 won the game!");
            }
            else{
                System.out.println("Player2 won the game");
            }
        } else if (numfromPlayer3==numfromGuesser) {
            System.out.println("Only Player3 won the game");
        }
        else{
            System.out.println("EveryOne Lost :(");
        }
    }
}

public class GuesserGameProject {

    public static void main(String[] args) {
        Umpire U = new Umpire();
        U.CollectfromGuesser();
        U.CollectfromPlayer();
        U.compare();
    }
}
