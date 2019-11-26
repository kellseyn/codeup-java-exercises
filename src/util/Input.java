package util;

import java.util.Scanner;

public class Input {
        private Scanner scanner = new Scanner(System.in);


        public String getString(){
            String string = scanner.nextLine();
            return string;
        }

        public boolean yesNo(){
            String choose = scanner.next();
            if (choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("yes")){
                return true;
            } else {
                return false;
            }
        }

        public int getInt(int min, int max){
            System.out.println("Gimme numbah naow");
            int pickNum = scanner.nextInt();
            while(true){
                if (pickNum < max && pickNum > min){
                    System.out.println("That's in the range!!");
                    return pickNum;
                } else {
                    System.out.println("Pick 'nother");
                    pickNum = scanner.nextInt();
                }
            }
        }





        public int getInt(){
            int theNum;
            while(true) {
                try {
                    String number = scanner.next();
                    theNum = Integer.valueOf(number);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Please input a integer.");
                }

            }
            return theNum;
        }



        public double getDouble(double min, double max){
            System.out.println("Gimme numbah naow");
            double pickNumber = scanner.nextInt();
            while(true){
                if (pickNumber < max && pickNumber > min){
                    System.out.println("That's close!");
                    return pickNumber;
                } else {
                    System.out.println("Pick a new one");
                    pickNumber = scanner.nextInt();
                }
            }
        }


        public double getDouble(){
            double truenum;
            while (true)
                try {
                    String number = scanner.next();
                    truenum = Double.valueOf(number);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please input a number.");
                }
            return truenum;
        }

}
