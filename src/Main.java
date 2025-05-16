import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    /*
    * Primitives are data types directly stored in the stack memory -> int, double, char, bool (immutable)
    * Reference data types are stored as pointers in the stack and directly stored in the heap memory
    *
    */

//        Scanner scanner = new Scanner(System.in);

        // scanner.next() returns a string
//        System.out.print("Enter password: ");
//        String userInput = scanner.nextLine();
//
//        //int parsedInput = Integer.parseInt(userInput);
//        if (userInput.equals("torque")){
//            System.out.println("TORQUE MARIA");
//        }else {
//            System.out.println("OH NO, TORQUE MARIA");
//        }

        /*Arrays in java are initialised with null values and have immutable length*/
        String[] users = new String[3];
        users[0] = "John Doe";
        users[1] = "William G. Morgan";

        String[] brands = {"Vujade", "Pearled Ivory", "Acne Studios"};
        for (String i:brands) {
            System.out.println(i);
        }
//        System.out.println(brands[2]);
    }
}