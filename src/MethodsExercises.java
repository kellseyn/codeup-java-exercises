import java.util.Scanner;

public class MethodsExercises {


    public static float addition(float a, float b) {
        return a + b;
    }

    public static float subtraction(float a, float b) {
        return a - b;
    }

    public static float multiplication(float a, float b) {
        return a * b;
    }

    public static float division(float a, float b) {
        return a / b;
    }

    public static float modulus(float a, float b) {
        return a % b;
    }

//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//            int userInput = scanner.nextInt();
//            if (userInput <= max & userInput >= min){
//                System.out.printf("Your number is %s%n", userInput);
//
//            } else {
//                System.out.printf("%s is not a valid number%n", userInput);
//            }
//
//
//    return getInteger(1, 10);
//
//
//    }



//    public static int factorial(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        if (userInput <= max & userInput >= min) {
//            System.out.printf("Your number is %s%n", userInput);
//            System.out.println("Do you want to continue?");
//            String confirm = scanner.next();
//            if (confirm.equalsIgnoreCase("yes") || confirm.startsWith("y")){
//                long answer= 1;
//                for (int i = 1; i <= userInput; i++){
//                    answer = answer * i;
//                }
//                System.out.printf("%d Is the factorial of %d%n",answer, userInput);
//            }else{
//                System.out.printf("%s? That's ok%n",confirm);
//            }
//
//        } else {
//            System.out.printf("%s is not a valid number%n", userInput);
//        }
//
//        return factorial(1, 10);
//
//    }



//    public static int diceGame(int sides) {
//        System.out.print("How many sides do each of your dice have? ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        System.out.printf("So you want to roll 2 %d -sided die? Type Roll ", userInput);
//            String roll =scanner.next();
//            if (roll.equalsIgnoreCase("roll")){
//                double totalOne = Math.floor(Math.random()* userInput) + 1;
//                double totalTwo = Math.floor(Math.random()* userInput) + 1;
//                System.out.printf("You rolled a %s and a %s for a total of %s%n", totalOne, totalTwo, (totalOne + totalTwo));
//            } else {
//                System.out.println("I guess you don't wanna play");
//            }
//
//        return diceGame(userInput);
//    }

        public static int highLow() {
            int theNumber = (int) (Math.random() * (100 - 1 * 1)) + 1;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess the number 1 - 100 ");
            int userNum = scanner.nextInt();

            if (userNum > theNumber){
                System.out.println("Lower");
            } else if (userNum < theNumber){
                System.out.println("Higher");
            } else if (userNum == theNumber){
                System.out.println("Congrats you figured it out");
            } else {
                System.out.println("That's illegal");
            }

            return highLow();
        }

    public static void main(String[] args) {
        System.out.println(addition(2,4));
        System.out.println(subtraction(2,4));
        System.out.println(multiplication(2,4));
        System.out.println(division(2,4));
        System.out.println(modulus(2,4));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial(1,20));
//        System.out.println(diceGame(6));
        System.out.println(highLow());
    }
}
