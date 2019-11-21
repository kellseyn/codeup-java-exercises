import java.util.Scanner;

public class ConsoleExercises {



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f %n", pi);

        System.out.println("Please enter an integer");
        Integer usersNum = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("%s %n", usersNum);

        System.out.println("Please type 3 words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        scanner.nextLine();
        System.out.printf("%s %s %s %n",firstWord, secondWord, thirdWord);


        System.out.println("Please write a sentence");
        String sentence = scanner.nextLine();
        System.out.printf("%s %n", sentence);

        System.out.println("Please enter the length, width and height of the classroom");
        Integer length = scanner.nextInt();
        Integer width = scanner.nextInt();
        Integer area = length * width;
        scanner.nextLine();
        System.out.printf("The area of the classroom is %s %n", area);

        System.out.println("Now what's the height of the classroom?");
        Integer height = scanner.nextInt();
        Integer volume = area * height;
        System.out.printf("The volume of the classroom is $s", volume);



//        String name = "Kellsey";
//        int favNum = 16;
//        System.out.println("Hello, " + name + "\n");
//        System.out.printf("Hello %s, how ya doing?\n", name);
//        System.out.printf("Hello %s, your favorite number is %d %n", name, favNum); //%% to show a %
//
//
//
//
//        System.out.println("What is your fave num?");
//        favNum = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("Hey there friendo. What's up?");
//        String input = scanner.nextLine();
//        System.out.printf("%s", input);
    }
}
