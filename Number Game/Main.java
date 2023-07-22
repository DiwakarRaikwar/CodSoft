import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("  hi ! Welcome to Guess game : ");
        Scanner get = new Scanner(System.in);

        System.out.println("you need to select number between 1 to 100 ");
        int choice = get.nextInt();
        System.out.println("now ! keep in mind which number you have selected and enter guess : ");

        int guess = get .nextInt();

        int count = 0;
        while ( guess != choice  ){
//            try {
//                guess = get.nextInt();
//            }catch (java.util.InputMismatchException e){
//                System.out.println("invalid input ");
//            }
            if ( guess > choice){
                System.out.println("your guess is < High > , please choose one more time ");
                guess = get.nextInt();

            }else {
                System.out.println("your guess is < Low > , please choose one more time ");
                guess = get.nextInt();

            }
            count ++;
        }
        System.out.print( " Congratulations ! you have find answer in : "+ count +" guess is : "+ guess);
    }

}
