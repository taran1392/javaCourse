package game;
import java.util.Scanner;
class GuessNumber {


    public static void main(String args[]){

        

    //variables
       int  tryCount =0;
       final int maxRetryCount=3;
    

       int  actualNo =10;

        Scanner scanner=new Scanner(System.in);

        while( tryCount<maxRetryCount){
            System.out.print("Please enter a no.: ");
               int guessedNo =  scanner.nextInt();

                if( guessedNo == actualNo )
                {
                        System.out.println("You have guessed the no. correctly");
                        break;

                    }
                if( guessedNo > actualNo)
                    System.out.println("Your Guess is greater ");
                else
                     System.out.println("Your Guess is smaller ");
                        

            tryCount++;

            if(tryCount>=maxRetryCount)
                System.out.println("Ypu have reached max. no of tries.Game Over");


        }




    }

//topics covered
    /*
    break
    final keyword
    Control variable - to control the no. of iteration of the loop

        Three Sections of the loop
            initialization
            Check Loop Condition
            Update Control variable

        For loop  
        While
        Do while


*/

    //implement the random no. part
    // implement the play again feature
}