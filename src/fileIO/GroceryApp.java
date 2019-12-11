package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryApp {

    final static String folder = "data";
    final static String fileName = "groceries.txt";


    public static void main(String[] args) {

        Path dataDirectory = Paths.get(folder);
        Path dataFile = Paths.get(folder, fileName);
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");


        try{
            if (Files.notExists(dataDirectory)){
                Files.createDirectories(dataDirectory);
            }
            if (! Files.exists(dataFile)){
                Files.createFile(dataFile);
            }


            Path filepath = Paths.get("data", "groceries.txt");
            Files.write(filepath, groceryList);
            Files.write(
                    filepath,
                    Arrays.asList("eggs"),
                    StandardOpenOption.APPEND
                    );

            List<String> newGroceryList = Files.readAllLines(filepath);

            System.out.println("groceryList = " + groceryList);
            System.out.println("lines = " + newGroceryList);

            
            for (int i = 0; i < newGroceryList.size(); i += 1){
                System.out.println((i + 1) + ": " + newGroceryList.get(i));
            }

            List<String> tempList = new ArrayList<>();
            for (String grocery : newGroceryList){
                if (grocery.equals("milk")){
                    tempList.add("cream");
                    continue;
                }

                if (grocery.equals("eggs")){
                    continue;
                }

                tempList.add(grocery);

            }

            Files.write(filepath, tempList);


        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
