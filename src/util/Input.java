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

                try {
                    theNum = Integer.valueOf(getString());
                    return theNum;

                } catch (NumberFormatException nfe) {
                    System.out.println("Please input an integer.");
                    return getInt();
                }


        }



        public double getDouble(double min, double max){
            System.out.println("Gimme numbah naow");
            double pickNumber = scanner.nextInt();

                if (pickNumber < max && pickNumber > min){
                    System.out.println("That's close!");
                    return pickNumber;
                } else {
                    System.out.println("Pick a new one");
                    return getDouble(min, max);
                }
        }


        public double getDouble(){
            System.out.println("Give me a decimal");
            double truenum;

                try {
                    truenum = Double.valueOf(getString());
                    return  truenum;
                } catch (NumberFormatException e) {
                    System.out.println("Please input a number.");

                    return getDouble();
                }
        }

}
