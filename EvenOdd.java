import java.util.Scanner;

class EvenOdd{

public static void main(String args[]){



    for(int i=0; i<args.length;i++  ){

           int num= Integer.parseInt( args[i] );

           if( num % 2 == 0 ){
               System.out.println(" "+num +" is  EVEN");
           }else{
                System.out.println(" "+num +" is  ODD");
           }


    }

    Scanner scanner= new Scanner(System.in);

    System.out.println("Please enter a number");
      int value = scanner.nextInt();
               /*  scanner.nextString();
                 scanner.nextFloat();
                 scanner.nextChar();
                 scanner.nextDouble();
                 scanner.nextLong();
*/

      System.out.println("Value entered by you "+ value);






//NUmber Guessing game
//Random r=new Random();
//
    //extend it to create a number guessing name
    //select a number between 1-30
    //give three chances to user to guess the no.
    //if guess==number then display success and terminate the program
    //if wrong display the msg whther guess is greater than or less than the number


}


}