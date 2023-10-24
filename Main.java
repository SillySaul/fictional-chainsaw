import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Homework.runMyAwesomeGame(args);
        Scanner applesauce = new Scanner(System.in);

        // System.out.println("Why does everybody like Keisha?");

        // String firstAnswer = applesauce.nextLine();

        // if(firstAnswer.equals("She has really good fashion")) {
        //     System.out.println("That is very true!");
        // }

        // slowType("Also William Craig Garis does mountains of cocaine very often");

         applesauce.close();
    }

    public static void slowType(String input) throws InterruptedException {
        char[] inputChars = input.toCharArray();

        for (int i = 0; i < inputChars.length; i++) {
            System.out.print(inputChars[i]);
            Thread.sleep(60);
        }
    }
    
}
