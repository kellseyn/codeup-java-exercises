import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//
//        }
//
//        int byTwo = 105;
//        do {
//            byTwo = byTwo -5;
//            System.out.println(byTwo);
//
//        }while(byTwo > -10);
//
//
//        double twoSquare = 2;
//        double square = 2;
//        do {
//            twoSquare = Math.pow(twoSquare, square);
//            System.out.println(twoSquare);
//        }while(twoSquare < 1000000);


        for (int i = 5; i <=15; i++){
            System.out.println(i);
        }

        for (int five = 105; five > -10;){
            System.out.println(five -= 5);
        }

        for (double squared = 2; squared < 1000000;){
            double square = 2;
            squared = Math.pow(squared, square);
            System.out.println(squared);
        }

        for (int num = 1; num <= 100; num++){

            if (num % 15 == 0){
                System.out.println("fizzbuzz");
            } else if (num % 5 == 0){
                System.out.println("buzz");
            }else if (num % 3 == 0){
                System.out.println("fizz");
            }else{
                System.out.println(num);
            }
        }

        System.out.println("What number would you like to go up to?");
        Integer input = scanner.nextInt();
        scanner.nextLine();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (double num = 1; num <= input; num++){
            double twoSquare = num;
            double square = 2;
            twoSquare = Math.pow(twoSquare, square);
            double cubed = num;
            double cube = 3;
            cubed = Math.pow(cubed, cube);

            System.out.printf("%s    | %s     | %s%n", num, twoSquare, cubed);
        }

        System.out.println("Pick a number 1 - 100");
        Integer num = scanner.nextInt();
        scanner.nextLine();


            if (num > 87 & num <= 100){
                System.out.println("A");
            } else if (num > 79){
                System.out.println("B");
            } else if (num > 66){
                System.out.println("C");
            } else if (num > 59){
                System.out.println("D");
            } else {
                System.out.println("F");
            }


    }
}
